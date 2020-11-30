package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import protocol.Chat;

public class MyServerSocket5 {
	private ServerSocket serversocket;
	// 대기열(큐) 다른클래스에서 사용할 것이여서 public
	Vector<SocketThread> vc;

	public MyServerSocket5() {
		try {
			serversocket = new ServerSocket(10000);
			vc = new Vector<>();
			// 클라이언트 방이름
			//int num = 1;
			while (true) {
				System.out.println("요청 대기");
				// 1. 새로운 소켓 생성 socket
				Socket socket = serversocket.accept();
				// 2. 새로운 스레드 생성
				// 3. 새로운 스레드 한테 socket변수 넘기기
				// 4. 새로운 스레드 자체를 vc에 담기
				System.out.println("요청 받음");
				SocketThread st = new SocketThread(socket);
				st.start();
				// 스레드를 Vector에 담은 이유 상태를 저장하기 위해서
				vc.add(st);
				//num++;

			}
		} catch (Exception e) {
			System.out.println("서버 연결 오류");
			// 오류나면 어디서 어떤 오류가 났는지 알려주는 트랙킹 해주는 것
			e.printStackTrace();
		}
	}

	class SocketThread extends Thread {
		// 콤포지션
		private Socket socket;
		// 상태 부여
		private String id;
		private BufferedReader reader;
		private PrintWriter writer;

		public SocketThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());
				
				String input = null;
				while((input = reader.readLine()) != null) {
					// Routing (라우팅 하기) 
					// 모든 벡터를 돌지 않고 자신은 제외하고 던진다
					// vc.get(i) != this 백터의 값이 내 스레드가 아니면 true
					routing(input);
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		}
		
		private void routing(String input) {
			String gubun[] = input.split(":");
			if(id == null) {
				if(gubun[0].equals("ID")) {
					id = gubun[1];
					
							writer.println("아이디는"+id+"입니다.");
							writer.flush();
					
				} else {
					
							writer.println("아이디를 정해주세요. (ID:이름)");
							writer.flush();
						
					
					return;
				}
				
				
			}
			
			
			if(gubun[0].equals(Chat.ALL)) { // 전체채팅 ALL:안녕
				for (int i = 0; i < vc.size(); i++) {
					if(vc.get(i) != this) {
						vc.get(i).writer.println(id+"-->"+gubun[1]);
						vc.get(i).writer.flush();
					}
				}
			} else if(gubun[0].equals(Chat.MSG)) { // MSG:ssar1:안녕
				String tempId = gubun[1];
				String tempMsg = gubun[2];
				
				for (int i = 0; i < vc.size(); i++) {
					if(vc.get(i).id.equals(tempId)) {
						vc.get(i).writer.println(id+"-->"+tempMsg);
						vc.get(i).writer.flush();
					}
				}
			} else if(gubun[0].equals(Chat.ID)) {
				id = gubun[1];
			}
		}



	}

	public static void main(String[] args) {
		new MyServerSocket5();

	}

}

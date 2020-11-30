package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MyServerSocket3 {
	
	// 서버 소켓 선언 SocketThread 타입을 가지는 벡터 선언 
	private ServerSocket serverSocket;
	private Vector<SocketThread> vc;
	
	// 생성자
	public MyServerSocket3() {
		try {
			// 서버 포트는 20000으로 정하고 구현 벡터 구현
			serverSocket = new ServerSocket(20000);
			vc = new Vector<>();
			
			
			while(true) {
				System.out.println("요청 대기");
				// 클라이언트 소켓을 담을 소켓을 선언 한 후
				// 소켓은 서버에 클라이이언트가 접속 하기 전까지 대기
				// 클라이언트가 접속 하기 전까진 여기서 Block상태.
				Socket socket = serverSocket.accept();
				System.out.println("요청 받음");
				// 내부 클래스 객체 생성하고 소켓을 생성자로 구현 한다.
				SocketThread st = new SocketThread(socket);
				// 내부 클래스 스레드를 상속 했고 스레드 실행
				st.start();
				// 백터에 스레드를 추가 한다.
				vc.add(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 스레드 생성 내부 클래스
	class SocketThread extends Thread {
		
		// 소켓 변수, 문자열 변수, 읽기, 쓰기 변수
		Socket socket;
		String id;
		BufferedReader reader;
		PrintWriter writer;
		
		// 클래스 생성시 소켓을 담으면 내부클래스 소켓에게 담기도록 생성자 구현
		public SocketThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			
			try {
				// 소켓이 읽기위한 스트림을 소켓에 통신을 위한 버퍼를 생성했다.
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 소켓이 쓰기위한 스트림을 받아 소켓에 쓰기 통신 버퍼 구현
				// true는 자동flush() 를 가능하게 해줌.
				writer = new PrintWriter(socket.getOutputStream(), true);
				// 읽어오기 위한 공간을 비워준다.
				String line = null;
				// 읽는공간이 비어있지 않으면-
				while((line = reader.readLine()) != null) {
					// -출력한다.
					System.out.println("from client : " + line);
					// 벡터의 모든 공간을 탐색한다.
					for(SocketThread socketThread : vc) {
						// 벡터의 모든 공간에 출력된 메세지를 다시 자동으로 쓰기버퍼로 통신한다.
						socketThread.writer.println(line);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new MyServerSocket3();
	}
}

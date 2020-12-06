package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

// 서버는 클라이언트의 접속을 기달리는 메인스레드와 클라이언트와 통신해서 입출력하는 스레드로 두개의 스레드가 필요하다.
public class Server {
	// 서버 소켓과 추가하는 소켓
	private ServerSocket serverSocket;
	private Socket socket;
	// 백터는 내부 스레드 클래스를 타입으로 가져야 한다
	// 왜? 백터 클라이언트가 들어올 때 마다 스레드를 만드는데 그 스레드를 백터에 순차적으로 관리하기 위해서?
	private Vector<CheckThread> vc;

	// 필수 초기 세팅
	private Server server = this;
	private static final String TAG = "Server :	";

	// 메인 스레드는 클라이언트가 들어오는지 확인만 하는 것이다.
	public Server() {
		try {
			serverSocket = new ServerSocket(10000);
			// 벡터 객체 만드는 것 잊지말기.
			vc = new Vector<>();
			while (true) {
				System.out.println("서버 요청 대기중....");
				socket = serverSocket.accept();
				System.out.println("서버 요청 확인.");
				// 대기 중 클라이언트가 접속하면 스레드를 만든다. 그 스레드 타겟은 CheckThread이고
				// CheckThread는 socket을 인자로 받는다. 소켓은 접속한 클라이언트와 연결된 소켓이다.
				//Thread st = new Thread(new CheckThread(socket));
				CheckThread st = new CheckThread(socket);
				st.start();
				vc.add(st);
			}
		} catch (IOException e) {
			System.out.println(TAG + "서버 연결 실패");
		}

	} // end of Constructor

	// 서버와 클라이언트와 통신하는 입출력 정보를 관리하고 클라이언트 마다 스레드 생성한다.
	class CheckThread extends Thread {
		// 소켓이 클라이언트 소켓과 연결점이다.
		private Socket socket;
		// 읽기와 쓰기 버퍼는 단다.
		private BufferedReader reader;
		private PrintWriter writer;
		// 룸에 접속했는지 알아내는 변수
		private boolean isInRoom;

		// CheckThread가 실행 될 때 서버가 만든 클라이언트 소켓을 받아 CheackThread 소켓과 연결하는것
		// Context Switching 
		public CheckThread(Socket socket) {
			this.socket = socket;
		}
		
		// 스레드가 실행되면 동작하는 메인 메소드
		@Override
		public void run() {
			try {
				// 읽기 쓰기 버퍼 객체화
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);
				String readline = null;
				isInRoom = false;

				// 읽은 값을 변수에 저장 후 파싱
				while ((readline = reader.readLine()) != null) {
					String[] parsReadline = readline.split("₩");
					
					// 프로토콜 정의
					if (parsReadline[0].equals("READY")) {
						// 준비 버튼에 토글 기능 추가
						isInRoom = !isInRoom;
						// 해당 소켓에만 전송
						for (int i = 0; i < vc.size(); i++) {
							if(vc.get(i) == this)
							vc.get(i).writer.println("SERVER₩" + parsReadline[1] + " : " + isInRoom);
						}
					} else if (isInRoom == true) {
						// 전체 채팅 프로토콜은 파싱했을 경우 읽어온 값과 파싱한 값이 똑같은 경우로 설정한다.
						if (parsReadline[0].equals(readline)) {
							for (int i = 0; i < vc.size(); i++) {
								// 쓰기할 땐 프로토콜을 걸어서 클라이언트한테 보낸다.
								// 왜? 그냥 코드 보기가 편하고 혹시모를 오류값을 대비할 수 있어서.
								vc.get(i).writer.println("CAHT₩" + parsReadline[0]);
							}
						}
					} else {
						for (int i = 0; i < vc.size(); i++) {
							if(vc.get(i) == this)
							vc.get(i).writer.println("SERVER₩준비 버튼을 먼저 눌러주세요.");

						}
					}

				}
			} catch (IOException e) {
				System.out.println(TAG + "읽기 오류.");
			}

		}

	}

	public static void main(String[] args) {
		new Server();
	}

} // end of Server

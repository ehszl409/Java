package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	
	private ServerSocket serverSocket;
	// 새로운 클라이언트 소켓을 담는 소켓
	private Socket socket;
	
	
	public MyServerSocket() {
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket(10000);
			System.out.println("클라이언트 요청 대기 중.....");
			// 대기하는 중 데몬(리스닝)
			// 대기를 하다가 접근하면 포트를 잡아주고 소켓을 만들어주는 함수
			socket = serverSocket.accept();
			System.out.println("요청이 성공함");
			
			// 버퍼로 데이터를 읽어온다. 우리는 소켓으로 데이터가 들어오기에 인자에 socket을 넣어준다.
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String input = null;
			while((input = reader.readLine()) != null) {
				System.out.println("클라이언트 메시지 : " + input);
			}
			
			reader.close();
			socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyServerSocket();
	}
}

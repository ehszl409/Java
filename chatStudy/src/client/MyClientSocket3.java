package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket3 {
	// 소켓, 읽기버퍼, 쓰기버퍼, 스캐너 선언
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;
	private Scanner sc;
	
	public MyClientSocket3() {
		try {
			// 소켓에 IP주소와 포트 번호를 담고 객체 생성;
			socket = new Socket("127.0.0.1", 20000);
			// 내부 클래스 객체 생성
			SocketThread st = new SocketThread();
			// 내부 클래스 속 스레드 실행
			st.start();
			
			// 소켓에 쓰기 데이터를 보내기위한 버퍼 생성 Auto flush() true
			writer = new PrintWriter(socket.getOutputStream(), true);
			// 스캐너 객체 생성
			sc = new Scanner(System.in);
			
			while(true) {
				// line에 문자열 입력
				String line = sc.nextLine();
				// 쓰기 버퍼로 통신
				writer.println(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// 스레드 생성을 위한 내부 클래스
	class SocketThread extends Thread {
		@Override
		public void run() {
			try {
				// 데이터를 읽어오기 위한 버퍼 객체 생성
				reader =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 읽는 공간이 Null이 아니라면 읽어온다.
				String line = null;
				while((line = reader.readLine()) != null) {
					System.out.println("from server : " + line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		}
	}
	
	public static void main(String[] args) {
		new MyClientSocket3();

	}

}

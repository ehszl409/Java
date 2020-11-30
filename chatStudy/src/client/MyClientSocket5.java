package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket5 {
	private Socket socket;
	private BufferedReader reader;
	
	// 키보드로 부터 입력 받고 넘기는 버퍼를 연결해준다.
	private Scanner sc;
	private PrintWriter writer;
	
	
	public MyClientSocket5() {
		try {
			socket = new Socket("localhost", 10000);
			
			SocketThread st = new SocketThread();
			st.start();
			
			sc = new Scanner(System.in);
			writer = new PrintWriter(socket.getOutputStream());
		
			
			
			while(true) {
				// ALL : 안녕, MSG:sarr1 : 안녕
				String keyboard = sc.nextLine();
				writer.println(keyboard);
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println("서버 연결 실패");
			e.printStackTrace();
		}
	}
	
	class SocketThread extends Thread {
		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String input = null;
				while((input = reader.readLine()) != null) {
					System.out.println(input);
				}
						
			} catch (Exception e) {
				System.out.println("연결 실패");
				e.printStackTrace();
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		new MyClientSocket5();

	}

}

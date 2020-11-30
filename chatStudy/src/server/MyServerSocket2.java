package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServerSocket2 {

	private ServerSocket serverSocket;
	// 새로운 클라이언트 소켓을 담는 소켓
	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;

	public MyServerSocket2() {
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket(10000);
			System.out.println("클라이언트 요청 대기 중.....");
			// 대기하는 중 데몬(리스닝)
			// 대기를 하다가 접근하면 포트를 잡아주고 소켓을 만들어주는 함수
			socket = serverSocket.accept();
			System.out.println("요청이 성공함");

			// 버퍼로 데이터를 읽어온다. 우리는 소켓으로 데이터가 들어오기에 인자에 socket을 넣어준다.
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			sc = new Scanner(System.in);

			String input = null;
			
			// while문 위에 있어야지 main스레드는 추가 스레드를 생성할 수 있다.
			Thread t1 = new Thread(new WriteThread());
			t1.start();
			
			while ((input = reader.readLine()) != null) {
				System.out.println("클라이언트 메시지 : " + input);
			}

			reader.close();
			socket.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	class WriteThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				String input = sc.nextLine();
				try {
					writer.write(input + "\n");
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		new MyServerSocket2();
	}
}

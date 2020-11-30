package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		// 키보드에서 읽을 scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		try {
			// 서버 소켓 생성
			listener = new ServerSocket(9999);
			System.out.println("연결을 기달리고 있습니다.....");
			// 클라이언트로 부터 연결 요청 대기
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// 클라이언트로부터 한 행 읽기
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하셨습니다.");
					// "bye"를 받으면 종료
					break;
				}
				System.out.println("클라이언트 : " + inputMessage);
				// 프롬프트
				System.out.println("보내기>>");
				// 키보드에서 한 행 읽기
				String outputMessage = scanner.nextLine();
				// 키보드에서 읽은 문자열 전송
				out.write(outputMessage + "\n");
				// out의 스트림 퍼터에 모든 문자열 전송
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				// scanner 닫기
				scanner.close();
				// 통신용 소켓 닫기
				socket.close();
				// 서버 소켓 닫기
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}

	}

}

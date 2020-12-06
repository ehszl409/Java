package client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 클라이언트 클래스속 메인 스레드는 쓰는것을 대기하고, 추가 스레드는 읽어와서 채팅창에 뿌리는 것을 동작한다.
public class Client extends JFrame{
	// 필수 초기 세팅
	private Client client = this;
	private static final String TAG = "Client : ";
	
	// 클라이언트가 서버와 소통을 위해서는 소켓을 만들어야한다.
	private Socket socket;
	// 읽기 쓰기 버퍼를 달아줘야한다.
	private PrintWriter writer;
	private BufferedReader reader;
	
	// 채팅을 하기 위한 JFrame들.
	private JButton btnReady;
	private JTextArea taChat;
	private JTextField tfChat;
	
	public Client() {
		// 연결을 위한 메소드
		connect();
		// 객체 생성을 위한 메소드
		init();
		// 기본 세팅을 위한
		setting();
		// 배치를 위한
		batch();
		// 이벤트를 위한
		listener();
		// 그리기 위한 메소드
		setVisible(true);
		
		
	}
	
	

	private void connect() {
		try {
			// 클라이언트 소켓은 IP 자신의 IP이고 포트는 서버 포트10000 으로 맞췄다.
			socket = new Socket("localhost", 10000);
			// 읽기 스레드를 만들고 실행.
			ReadThread rt = new ReadThread();
			rt.start();
		} catch (Exception e) {
			System.out.println(TAG + "서버 연결 실패.");
			
		}
		
	}


	private void listener() {
		// 준비 버튼 클릭하면 이벤트 작동
		btnReady.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendReady();
				
			}
		});
		
		// 글을 입력하고 엔터치면 이벤트 작동
		tfChat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendChat();
				
			}
		});
		
	}


	private void batch() {
		add(btnReady, BorderLayout.EAST);
		add(taChat, BorderLayout.CENTER);
		add(tfChat, BorderLayout.SOUTH);
	}


	private void setting() {
		setTitle("room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		//setLayout(new BorderLayout());

	}


	private void init() {
		btnReady = new JButton("준비");
		taChat = new JTextArea();
		tfChat = new JTextField();
		
	}

	private void sendReady() {
		try {
			// 쓰기 버퍼 달고 메소드 실행 시 문자열을 서버로 쓴다.
			writer = new PrintWriter(socket.getOutputStream(), true);
			writer.println("READY₩준비 버튼 상태");
		} catch (IOException e) {
			System.out.println(TAG + "전송 실패");
		}
		
	}
	
	private void sendChat() {
		try {
			// 쓰기 버퍼를 달고 TextField에 적혀 있는 문자열을 받아와 쓰기로 통신한다. 
			writer = new PrintWriter(socket.getOutputStream(), true);
			String chating = tfChat.getText();
			writer.println(chating);
			// 입력칸 비우기
			tfChat.setText("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of sendChat
	
	// 메세지를 서버로 부터 받아 읽는 스레드
	class ReadThread extends Thread {
		
		@Override
		public void run() {
			try {
				// 통신을 통해 읽어온다.
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String readline = null;
				while((readline = reader.readLine()) != null) {
					// 파싱
						String[] parsReadline = readline.split("₩");
						// 프로토콜 정의
						if(parsReadline[0].equals("SERVER")) {
							taChat.append("[SERVER]: " + parsReadline[1] + "\n");
						} else if(parsReadline[0].equals("CAHT")) {
							taChat.append("[CHAT]: " + parsReadline[1] + "\n");
						}
					
				}
			} catch (IOException e) {
				System.out.println(TAG + "메세지 읽어오기 실패.");	
			}
		
		}
	} // end of ReadThread
	
	
	

	public static void main(String[] args) {
		new Client();

	}

}

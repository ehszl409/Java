package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event01 extends JFrame {
	private JButton btn1;
	private JLabel la1;
	
	
	
	public Event01() {
		setTitle("Event01");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn1 = new JButton("클릭하세요.");
		la1 = new JLabel("클릭안됨");
		la1.setFont(new Font("Serif", Font.BOLD, 50));
		
		// JFrame이 기본적으로 가지고 있는 JPanel에 접근하기 위해.
		Container c = getContentPane();
		c.add(la1, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.SOUTH);
		
		// 1. 리스너 등록 (리스너 = 인터페이스(메서드 전달을 위해서))
		btn1.addActionListener(new ActionListener() {
			
			// 익명 클래스 (메서드(스택)을 등록) 이벤트 분배 스레드가 찾아나서 때려준다 콜백
			// OS가 계속해서 이벤트가 발생했는지 지켜보고 있다가 발생하면 이벤트 분해 스레드
			// 한테 알려준다. 그리고 이분스가 찾아서 떄린다.
			
			// 왜 인터페이스 추상 클래스를 오버라이딩해야 하는 건가?
			// 이벤트 분배 스레드가 actionPerformed함수를 때려 줘야 하는데 개발자 마음대로
			// 함수명을 지정하면 이벤트 분배 스레드가 무슨 함수를 떄려야 하는지 모른다
			// 그래서 자바는 함수명에 강제성을 부여하기위해 인터페이스로 만들었다.
			@Override
			public void actionPerformed(ActionEvent e) {
				la1.setText("클릭됨");
				
			}
		});
		
		// 2. JVM(OS)이 어떤 이벤트가 발생했는지를 확인하고
		// 3. 발생된 이벤트를 이벤트 분배 스레드에 등록 (대기열 등록)
		// 4. 순서대로 리스너(인터페이스)가 실행
		
		
		
		setVisible(true); // 항상 생성자 가장 마지막에 있어야한다.
	}

	public static void main(String[] args) {
		new Event01();

	}

}

package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame {
	private JLabel[] KeyMassage;
	
	public KeyListenerEx() {
		setTitle("KeyListener EX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		// 레이블 배열을 3개 생성하고 각 레이블 컴포넌트 생
		KeyMassage = new JLabel [3]; // 레이블 배열 생성
		KeyMassage[0] = new JLabel(" getKeycode()  ");
		KeyMassage[1] = new JLabel(" getKeycode()  ");
		KeyMassage[2] = new JLabel(" getKeycode()  ");
		
		// 3개의 레이블 컴포넌트를 
		for (int i = 0; i < KeyMassage.length; i++) {
			c.add(KeyMassage[i]);
			KeyMassage[i].setOpaque(true); // 배경색이 보이도록 불투명 속성 설정
			KeyMassage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); // 키 코드 알아내기
			char KeyChar = e.getKeyChar(); // 키 문자 값 알아내기
			KeyMassage[0].setText(Integer.toString(keyCode));
			KeyMassage[1].setText(Character.toString(KeyChar));
			KeyMassage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed");	
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("keyTyped");
		
		}
	}
	

	public static void main(String[] args) {
		new KeyListenerEx();

	}

}

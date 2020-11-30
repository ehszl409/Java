package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx() {
		setTitle("KeyListener EX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());	
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			// la에 입력된 키의 키 이름 문자열을 출력하여 사용자에게 보고함.
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입렵되었습니다.");
			
			if(e.getKeyChar() == '%') {
				contentPane.setBackground(Color.YELLOW);
			} else if(e.getKeyCode() == KeyEvent.VK_L){
				contentPane.setBackground(Color.GREEN);
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		new KeyCodeEx();

	}

}

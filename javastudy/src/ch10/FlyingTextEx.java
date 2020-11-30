package ch10;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELL");
	
	public FlyingTextEx() {
		setTitle("상, 하, 자, 우키를 이용하여 텍스트를 움직이자");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 컨텐츠팬 배치관리 삭제
		c.addKeyListener(new MyKeyListener()); // 컨텐츠팬에 리스너 달기
		la.setLocation(50, 50); // la의 초기위치 (50, 50)
		la.setSize(100, 20);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
		// 다음 코드는 컨텐트팬에 포커스를 잃을 경우 마우스를 클릭하면 다시 포커스를 얻게 함.
		c.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource(); // 마우스가 클릭된 컴포넌트
				com.setFocusable(true);
				com.requestFocus(); // 마우스가 클릭된 컴포넌트에게 포커스 설정
			
			}
		});
		
	}
	
	class MyKeyListener extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP :
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break;
			case KeyEvent.VK_DOWN :
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
			case KeyEvent.VK_RIGHT :
				la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;
			case KeyEvent.VK_LEFT :
				la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
			}
		
		}
		
	}

	public static void main(String[] args) {
		new FlyingTextEx();

	}

}

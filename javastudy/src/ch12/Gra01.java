package ch12;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra01 extends JFrame {
	 
	private MyPanel panel = new MyPanel();

	public Gra01() {
		setTitle("JPanel의 paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		public void paintComponents(Graphics g) { // 패널 내의 이전의 그려진 잔을 지우기 위해 호
			
			super.paintComponents(g);
			g.setColor(Color. BLUE);
			g.drawRect(10, 10, 50, 50);
		}
	}
	
	public static void main(String[] args) {
		new Gra01();

	}

}

package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra02 extends JFrame {

	private MyPanel panel;
	int x = 10;
	int y = 10;

	public Gra02() {
		setTitle("repaint제");
		setSize(400, 500);

		// 커스텀 마이징 가능
		panel = new MyPanel();
		setContentPane(panel);

		setVisible(true);
	}

	class MyPanel extends JPanel {
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					// 내가 클릭한 x,y의 좌표
					x = e.getX();
					y = e.getY();
					System.out.println("x : "+x);
					System.out.println("y : "+y);
					repaint();
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(x, y, 50, 50);
		}
	}

	public static void main(String[] args) {
		new Gra02();
	}
}

package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx02 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx02() {
		setTitle("패널 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 300);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel {
		// 이미지 로딩
		private ImageIcon icon = new ImageIcon("/Users/shinyulpark/Desktop/Spring Frame Work/img/11:4/airbnb/choo1.png");
		// 이미지 객체
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx02();

	}

}

package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx03 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx03() {
		setTitle("이미지 일부분을 크기 조절하여 그리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 300);
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
			
			// 이미지의 (100,50)에서 (200,200)의 영역을 패널상의 (20,20)에서 
			// (250,100)의 영역으로 확장하여 그린다.
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200,this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx03();

	}

}

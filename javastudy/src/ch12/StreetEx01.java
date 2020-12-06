//package ch12;
//
//import java.awt.Container;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//class MyThread extends Thread {
//		
//	StreetEx01 streetEx01;
//	
//	public MyThread(StreetEx01 streetEx01) {
//		this.streetEx01 = streetEx01;
//	}
//	
//	
//	new Thread(new Runnable() {
//		@Override
//		public void run() {
//			while(true){
//				if (streetEx01.x < 1400) {
//					streetEx01.x = streetEx01.x + 10;
//					streetEx01.repaint();
//					System.out.println(streetEx01.x);
//				} else break;
//
//				try {
//					Thread.sleep(20);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			
//		}
//	})
//}
//
//public class StreetEx01 extends JFrame {
//	
//	StreetEx01 streetEx01;
//
//	int x = 360;
//	int y = 20;
//	Container c;
//
//	public StreetEx01() {
//		setTitle("장풍");
//		setSize(1500, 300);
//		// 화면을 정 중앙에 놓는다.
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		c = getContentPane();
//		// c.add(null);
//
//		// 패널을 바로 add
//		c.add(new GamePanel());
//		setVisible(true);
//	}
//
//	class GamePanel extends JPanel {
//		ImageIcon imgIconPlayer, imgIconJang;
//		Image imgPlayer, imgJang;
//
//		public GamePanel() {
//			imgIconPlayer = new ImageIcon("img/player.png");
//			imgIconJang = new ImageIcon("img/jang.png");
//			imgPlayer = imgIconPlayer.getImage();
//			imgJang = imgIconJang.getImage();
//
//			// 키이벤트를 여기 만들면 된다.
//			setFocusable(true);
//			addKeyListener(new KeyAdapter() {
//				@Override
//				public void keyPressed(KeyEvent e) {
//					if (e.getKeyCode() == KeyEvent.VK_RIGHT && (x < 470)) {
//						System.out.println(x);
//						x = x + 10;
//					} else if (e.getKeyCode() == KeyEvent.VK_LEFT && (x > 360)) {
//						System.out.println(x);
//						x = x - 10;
//					}
//					if (e.getKeyChar() == KeyEvent.VK_SPACE) {
//						Thread th = new Thread(new MyThread(streetEx01));
//						th.start();
//					}
//					repaint();
//				}
//			});
//		}
//
//		@Override
//		protected void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			// observer 중요하지 않다.
//			g.drawImage(imgPlayer, 0, 0, null);
//			g.drawImage(imgJang, x, y, null);
//		}
//	}
//
//	public static void main(String[] args) {
//		new StreetEx01();
//
//	}
//
//}

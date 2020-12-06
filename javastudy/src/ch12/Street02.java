package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street02 extends JFrame {
	// context switching 
	Street02 street = this;
	
	private boolean isRunning = true;
	private int x = 360;
	private int y = 20;
	private Container c;
	
	
	public Street02() {
		setTitle("장풍");
		setSize(1500, 300);
		// 화면을 정 중앙에 놓는다.
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		//c.add(null);
		
	
		
		
		// 패널을 바로 add
		c.add(new GamePanel());
		setVisible(true);
	}
	
	// JFranme의 기본적인 Layout BorderLayout
	// JPanel의 기본적인 Layout FlowLayout
	class GamePanel extends JPanel {
		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		JButton btn;
		
		public GamePanel() {
			imgIconPlayer = new ImageIcon("img/player.png");
			imgIconJang = new ImageIcon("img/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("stop");
			add(btn);
			
			// 키이벤트를 여기 만들면 된다.
			// 포커스를 panel로 맞추어 줘야지 이벤트가 먹힌다.
			setFocusable(true);
			addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
						isRunning = true;
						new Thread(new Runnable() {
							@Override
							public void run() { // run 메서드 종료 = whil문의 종료
								while(isRunning) {
									if (x > 1500) break;
									x = x + 10;
									repaint();
									try {
										Thread.sleep(20);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								
							}
						}).start();
						
					}
				}
			});
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							// 토글을 만드는 방법
							isRunning = !isRunning;
							
						}
					}).start();
					
				}
			});
		}
		
		// 직접 그렸기 때문에 Layout의 영향을 받지 않는다.
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// observer 중요하지 않다.
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}
	}
	
	public static void main(String[] args) {
		new Street02();

	}

}

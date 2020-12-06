package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable {
	
	// context 저장
	private BubbleApp bubbleApp = this;
	// 태그 (파일 마다 태그를 남겨줘야지 어디 log인지 확인할 수 있다.)
	private static final String TAG = "BubbleApp : ";
	private JLabel laBackground;
	private Player player;

	public BubbleApp() {
		init();
		setting();
		batch();
		listener();
		
		// Visible은 여기 고정
		setVisible(true);
	}
	
	@Override
	public void init() {
		laBackground = new JLabel(new ImageIcon("img/bg.png"));
		player = new Player();
		
	}

	@Override
	public void setting() {
		setTitle("Bubble Bubble");
		setSize(1000, 639);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // Layout이 border, flow도 아니다.
		setContentPane(laBackground);
	}

	@Override
	public void batch() {
		// Container는 생략가능
		add(player);
		
	}

	@Override
	public void listener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// 메소드 명에 행위를 먼저 적으니 자동완성과 가독성이 높아진다.
					player.moveRight();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.moveLeft();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					player.moveUp();
				}
			
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// 메소드 명에 행위를 먼저 적으니 자동완성과 가독성이 높아진다.
					player.isRight = false;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.isLeft = false;
				}
			}
			
			
		});
		
	}
	
	public static void main(String[] args) {
		new BubbleApp();
	}
}


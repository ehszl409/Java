package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 플레이어도 하나의 이미지 이다. 그래서 인터페이스를 하지 않아도 된다.
// 프레임이면 인터페이스를 해줘야 한다.
public class Player extends JLabel {

	public Player player = this;
	public static final String TAG = "Player : ";
	
	// 플레이어의 오른쪽 왼쪽 모습
	public ImageIcon icPlayerR, icPlayerL;
	// 플레이어의 좌표
	public int x = 55;
	public int y = 535;
	
	// 플레이어가 이동하는 상태를 묻는 변수
	public boolean isRight = false;
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	// 맵의 층을 나타내는 변
	public int floor = 1; // 1층 535, 2층 415, 3층 295, 4층 177
	
	
	public Player() {
		icPlayerR = new ImageIcon("img/playerR.png");
		icPlayerL = new ImageIcon("img/playerL.png");
		setIcon(icPlayerR);
		// 변하지 않는다 그래서 상수로 설정
		setSize(50, 50);
		setLocation(x, y);
	}

	// 메소드 명을 통일을 해줘라 동사+명사, 명사+동사
	public void moveRight() {
		System.out.println(TAG + "moveRight");
		setIcon(icPlayerR);
		// 움직이기 위한 스레드를 따로 만들어 준다.
		// 버튼을 꾹 눌르때 가속을 없어준다.
		if(isRight == false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// 연산은 thread속에 배치.
					isRight = true;
					while(isRight) {
						x = x+3;
						// 내부적으로 repaint()가 있다.
						setLocation(x, y);
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				}
			}).start();
		}
		
	}
	
	public void moveLeft() {
		System.out.println(TAG + "moveLeft");
		// 플레이어가 보는 방향으로 이미지를 새로 만들어준다.
		setIcon(icPlayerL);
		
		// 움직이기 위한 스레드를 따로 만들어 준다.
		// 버튼을 꾹 눌르때 가속을 없어준다.
		if(isLeft == false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// 연산은 thread속에 배치.
					isLeft = true;
					while(isLeft) {
						x = x-3;
						// 내부적으로 repaint()가 있다.
						setLocation(x, y);
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				}
			}).start();
		}
	}
	
	public void moveUp() {
		System.out.println(TAG + "moveUp");
		
		if(isUp == false) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				isUp = true;
				if(floor == 1 &&  530 < y && y < 540) {
				 for (int i = 0; i < 10; i++) {
					y = y - 13;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				}
				isUp = false;
				moveDown();
				
			}
		}).start();
		}
	}
	
	public void moveDown() {
		System.out.println(TAG + "moveDown");
		if(isDown == false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					isDown = true;
					while(isDown) {
						y = y+3;
						setLocation(x, y);
						if((floor == 1) && /*X좌표까지 계산해야 완벽*/(y > 535)) break;
						try {
							Thread.sleep(10);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					isDown = false;
				}
			}).start();
			}
	}
	
	
	
	// 구현 안함
	public void attack() {
		System.out.println(TAG + "attack");
	}
	
	
}

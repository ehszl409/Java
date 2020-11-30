package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; // 타이머 값이 출력되는 레이블

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel; // 타이머 카운트를 출력하는 테이블
	}
	
	
	// 스레드코드. run()이 종료되면 종료
	@Override
	public void run() {
		int n = 0; // 타이머 카운트 값
		while (true) { // 무한 루프
			timerLabel.setText(Integer.toString(n));
			n++; // 카운트 증가

			try {
				Thread.sleep(1000); // 1초 단위
			} catch (InterruptedException e) {
				return; // 예외가 발생하면 스레드 종료
			}
		}

	}

}

public class TimerThreadEx2 extends JFrame {
	private Thread th;
	
	public TimerThreadEx2() {
		setTitle("ThreadIntertuptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		// 타이머 스레드로 사용할 Runnable 객체 생성
		// 타이머 값을 출력할 레이블 컴포넌트를 생성자에 전달한다.
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel); // 레이블을 컨텐트팬에 부착
		
		// 버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // 타이머 스레드 강제 종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); // 버튼 비활성
				
			}
		});
		
		c.add(btn);
		setSize(300, 170);
		setVisible(true);

		th.start(); // 타이머 스레드의 실행을 시작하게 한다.
	}

	public static void main(String[] args) {
		new TimerThreadEx2();

	}

}

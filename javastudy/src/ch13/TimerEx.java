package ch13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TimerRun implements Runnable {
	private JLabel timerRun;
	LocalDateTime now = LocalDateTime.now();
	int nowH = now.getHour();
	int nowM = now.getMinute();
	int nowS = now.getSecond();

	public TimerRun(JLabel timerRun) {
		this.timerRun = timerRun;
	}

	@Override
	public void run() {
		while (true) {
			timerRun.setText(Integer.toString(nowH) + 
					":" + Integer.toString(nowM) + 
					":" + Integer.toString(nowS));
			nowS++;
			if (nowS == 60) {
				nowM++;
				nowS = 0;
			} else if (nowM == 60) {
				nowH++;
				nowM = 0;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}

	}
}

public class TimerEx extends JFrame {
	private Container c;
	private JLabel timerJl;
	private JPanel jp;
	private Thread th;
	private TimerRun run;

	public TimerEx() {
		initObject();

		initSetting();

		initBatch();
	}

	private void initBatch() {
		c.add(jp, BorderLayout.CENTER);
		jp.add(timerJl);
		c.setLayout(new FlowLayout());

	}

	private void initSetting() {
		setTitle("Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		c = getContentPane();
		th.start();

	}

	private void initObject() {
		timerJl = new JLabel();
		jp = new JPanel();
		run = new TimerRun(timerJl);
		th = new Thread(run);

	}

	public static void main(String[] args) {
		new TimerEx();
	}

}

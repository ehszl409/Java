package ch09;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JButton;

public class Swing0 extends JFrame {
	private Container c;
	private JPanel topJp, centerJp;
	private JButton openBtn, readBtn, closeBtn;
	private JLabel helloJl, javaJl, loveJl;

	public Swing0() {
		// 1. 필요한 오브젝트를 메모리에 로딩
		initObject();

		// 2. 세팅
		initSetting();

		// 3. 배치
		initBatch();
	}

	private void initBatch() {
		c.add(topJp, BorderLayout.NORTH);
		c.add(centerJp, BorderLayout.CENTER);

		topJp.add(openBtn);
		topJp.add(readBtn);
		topJp.add(closeBtn);

		centerJp.add(helloJl);
		centerJp.add(javaJl);
		centerJp.add(loveJl);

		helloJl.setBounds(56, 124, 61, 16);
		javaJl.setBounds(168, 43, 61, 16);
		loveJl.setBounds(298, 145, 61, 16);

	}

	private void initSetting() {
		setTitle("Swing 구조 연습");
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		topJp.setBackground(Color.DARK_GRAY);
		centerJp.setLayout(null);

	}

	private void initObject() {
		topJp = new JPanel();
		centerJp = new JPanel();

		openBtn = new JButton("open");
		readBtn = new JButton("read");
		closeBtn = new JButton("close");

		helloJl = new JLabel("hello");
		javaJl = new JLabel("java");
		loveJl = new JLabel("love");
	}

	public static void main(String[] args) {
		new Swing0();
	}
}

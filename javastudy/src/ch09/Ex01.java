package ch09;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 extends JFrame {
	private Container c;
	private JPanel southJp;
	private JButton northBtn, centerBtn, southBtn1, southBtn2, southBtn3;

	public Ex01() {

		// 1. 필요한 오브젝트를 메모리에 로딩
		initObject();

		// 2. 세팅
		initSetting();

		// 3. 배치
		initBatch();

	}

	private void initBatch() {
		c.add(northBtn, BorderLayout.NORTH);
		c.add(centerBtn, BorderLayout.CENTER);
		c.add(southJp, BorderLayout.SOUTH);
		southJp.add(southBtn1);
		southJp.add(southBtn2);
		southJp.add(southBtn3);

	}

	private void initSetting() {
		setTitle("Ex01");
		setSize(200, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

	}

	private void initObject() {
		southJp = new JPanel();
		northBtn = new JButton("NorthBtn");
		centerBtn = new JButton("CenterBtn");
		southBtn1 = new JButton("SouthBtn1");
		southBtn2 = new JButton("SouthBtn2");
		southBtn3 = new JButton("SouthBtn3");
	}

	public static void main(String[] args) {
		new Ex01();

	}

}

package ch09;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class JpanelEx01 extends JFrame {
	private Container c;
	private GridLayout grid;
	private JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5, jbtn6, jbtn7, jbtn8, jbtn9;

	public JpanelEx01() {

		// 1. 필요한 오브젝트를 메모리에 로딩
		initObject();

		// 2. 세팅
		initSetting();

		// 3. 배치
		initBatch();

	}

	private void initBatch() {
		grid.setVgap(3);
		c.add(jbtn1);
		c.add(jbtn2);
		c.add(jbtn3);
		c.add(jbtn4);
		c.add(jbtn5);
		c.add(jbtn6);
		c.add(jbtn7);
		c.add(jbtn8);
		c.add(jbtn9);

	}

	private void initSetting() {
		setTitle("jpanelEx");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(grid);

	}

	private void initObject() {
		grid = new GridLayout(3, 3);
		jbtn1 = new JButton("1");
		jbtn2 = new JButton("2");
		jbtn3 = new JButton("3");
		jbtn4 = new JButton("4");
		jbtn5 = new JButton("5");
		jbtn6 = new JButton("6");
		jbtn7 = new JButton("7");
		jbtn8 = new JButton("8");
		jbtn9 = new JButton("9");

	}

	public static void main(String[] args) {
		new JpanelEx01();
	}

}

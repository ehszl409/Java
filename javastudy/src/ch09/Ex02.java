package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex02 extends JFrame{
	
	public Ex02() {
		setTitle("Sample");
		// X버튼 클릭하면 mani이 종료됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		Container c = getContentPane();
		Panel c1 = new Panel();
		//Panel c2 = new Panel();
		
		JButton btn1 = new JButton("button1");
		
		c.add(c1, BorderLayout.NORTH);
		c.add(btn1, BorderLayout.SOUTH);
		
		
		c1.setLayout(grid);
		c1.add(new JLabel("이름"));
		c1.add(new JTextField(""));
		c1.add(new JLabel("학번"));
		c1.add(new JTextField(""));
		c1.add(new JLabel("학과"));
		c1.add(new JTextField(""));
		c1.add(new JLabel("과목"));
		c1.add(new JTextField(""));
		
	
		
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Ex02();

	}

}

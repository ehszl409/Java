package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex03 extends JFrame{
	public Ex03() {
		setTitle("Ex03");
		setSize(400, 200);
		setVisible(true);
		
		GridLayout grid = new GridLayout(1, 8);
		Container c = getContentPane();
		c.setLayout(grid);
		grid.setVgap(2);
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");

		jb1.setBackground(Color.BLACK);
		jb2.setBackground(Color.YELLOW);
		jb3.setBackground(Color.BLUE);
		jb4.setBackground(Color.DARK_GRAY);
		jb5.setBackground(Color.ORANGE);
		jb6.setBackground(Color.LIGHT_GRAY);
		jb7.setBackground(Color.LIGHT_GRAY);
		jb8.setBackground(Color.RED);
		
		
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		c.add(jb6);
		c.add(jb7);
		c.add(jb8);
		
	

	}

	public static void main(String[] args) {
		new Ex03();

	}

}

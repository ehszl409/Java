package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 extends JFrame {
	
	public Ex04() {
		setTitle("Ex04");
		setSize(300, 300);
		setVisible(true);
		
		Container c = getContentPane();
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		JButton jb1 = new JButton("Open");
		JButton jb2 = new JButton("Read");
		JButton jb3 = new JButton("Close");
		JLabel jl1 = new JLabel("Hello");
		JLabel jl2 = new JLabel("Java");
		JLabel jl3 = new JLabel("Love");
		//c.setLayout(null);
		
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		p1.add(jb1);
		p1.add(jb2);
		p1.add(jb3);
		
		
	}

	public static void main(String[] args) {
		new Ex04();

	}

}

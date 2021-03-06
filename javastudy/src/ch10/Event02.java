package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event02 extends JFrame implements ActionListener {
	private JLabel laTitle;
	private JButton btn1, btn2, btn3, btn4;
	private Container c;

	public Event02() {
		laTitle = new JLabel("사과");
		btn1 = new JButton("딸기 클릭");
		btn2 = new JButton("바나나 클릭");
		btn3 = new JButton("사과 클릭");
		btn4 = new JButton("메론 클릭");
		c = getContentPane();

		c.add(laTitle, BorderLayout.NORTH);
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.CENTER);
		c.add(btn3, BorderLayout.EAST);
		c.add(btn4, BorderLayout.SOUTH);

		// 익명클래스를 이용해서 구현

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("클릭됨" + e.getSource());
				JButton btn = (JButton)e.getSource();
				System.out.println(btn.getText());
			}
		});
		
		
		
		setTitle("Event 02");
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Event02();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource()의 리턴타입은 Object
		System.out.println("클릭됨" + e.getSource());
		JButton btn = (JButton)e.getSource();
		System.out.println(btn.getText());
		
		if(btn.getText().equals("딸기 클릭")) {
			laTitle.setText("딸기");
		} else if (btn.getText().equals("바나나 클릭")) {
			laTitle.setText("바나나");
		} else if (btn.getText().equals("사과 클릭")) {
			laTitle.setText("사과");
		}
	}

}

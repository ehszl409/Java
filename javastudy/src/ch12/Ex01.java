package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.stream.events.StartDocument;

public class Ex01 extends JFrame {
	private JButton btn;
	private MyPanel panel;
	private ArrayList<Integer> num;
	private int standardY;
	private int x1, x2, x3, x4, x5;
	private int count;

	public Ex01() {
		setTitle("그래프 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);

		btn = new JButton("클릭");
		num = new ArrayList<>();
		panel = new MyPanel();
		setContentPane(panel);
		panel.setLayout(new BorderLayout());
		panel.add(btn, BorderLayout.SOUTH);
		num.add(0,400);
		num.add(1,400);
		num.add(2,400);
		num.add(3,400);
		num.add(4,400);
		standardY = 400;
		x1 = 40;
		x2 = 120;
		x3 = 200;
		x4 = 280;
		x5 = 360;
		count = 0;

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				standardY = 400;
				//num.clear();
				count++;
				if (count == 1) {
					new Thread() {
						public void run() {
							int up = 400;
							for (int i = 0; i < 10; i++) {
								up = up - 37;
								num.set(0, up);
								num.set(1, 400);
								num.set(2, 400);
								num.set(3, 400);
								num.set(4, 400);	
								System.out.println(num.size());
								repaint();
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					}.start();
				}
				if (count == 2) {
					new Thread() {
						public void run() {
							int up = 400;
							for (int i = 0; i < 10; i++) {
								up = up - 20;
								num.set(1, up);
								num.set(0, 30);
								num.set(2, 400);
								num.set(3, 400);
								num.set(4, 400);								
								repaint();
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					}.start();

				}
				if (count == 3) {
					new Thread() {
						public void run() {
							int up = 400;
							for (int i = 0; i < 10; i++) {
								up = up - 34;
								num.set(2, up);
								num.set(0, 30);
								num.set(1, 200);
								num.set(3, 400);
								num.set(4, 400);								
								repaint();
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					}.start();

				}
				if (count == 4) {
					new Thread() {
						public void run() {
							int up = 400;
							for (int i = 0; i < 10; i++) {
								up = up - 31;
								num.set(3, up);
								num.set(0, 30);
								num.set(1, 200);
								num.set(2, 60);
								num.set(4, 400);								
								repaint();
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					}.start();
				}
				if (count == 5) {
					new Thread() {
						public void run() {
							int up = 400;
							for (int i = 0; i < 10; i++) {
								up = up - 25;
								num.set(4, up);
								num.set(0, 30);
								num.set(1, 200);
								num.set(2, 60);
								num.set(3, 90);								
								repaint();
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					}.start();
				}
				if (count > 5) {
					standardY = 400;
					num.set(0,400);
					num.set(1,400);
					num.set(2,400);
					num.set(3,400);
					num.set(4,400);
					count = 0;
					repaint();
				}

			}
		});

		setVisible(true);
	}

	class MyPanel extends JPanel {

		public MyPanel() {

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(x1, standardY, x1, num.get(0));
			g.drawLine(x2, standardY, x2, num.get(1));
			g.drawLine(x3, standardY, x3, num.get(2));
			g.drawLine(x4, standardY, x4, num.get(3));
			g.drawLine(x5, standardY, x5, num.get(4));

		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

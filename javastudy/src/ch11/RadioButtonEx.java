package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class RadioButtonEx extends JFrame {

	public RadioButtonEx() {
		setTitle("라디오박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 이미지 체크 박스에 사용할 2개의 이미지 객체 생성
		ImageIcon ic1 = new ImageIcon("/Users/shinyulpark/Desktop/Spring Frame Work/img/11:4/airbnb/choo3.png");
		
		ImageIcon ic2 = new ImageIcon("/Users/shinyulpark/Desktop/Spring Frame Work/img/11:4/airbnb/choo4.png");
		
		ButtonGroup g  = new ButtonGroup();
		
		// 체크박스 3개 생성
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리",ic1);
		
		// 체크박스 외곽선이 보이도록 설정
		cherry.setBorderPainted(true);
		// 선택 상태 이미지 등록
		cherry.setSelectedIcon(ic2);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();

	}

}

package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonItemEventEx extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] text = {"도쿄","런던" ,"로스엔젤레스"};
	private ImageIcon[] image = {
			new ImageIcon("/Users/shinyulpark/Desktop/Spring Frame Work/img/11:4/airbnb/choo2.png"),
			new ImageIcon("/Users/shinyulpark/Desktop/Spring Frame Work/img/11:4/airbnb/choo3.png"),
			new ImageIcon("/Users/shinyulpark/Desktop/Spring Frame Work/img/11:4/airbnb/choo4.png")
	};
	private JLabel imageLabel = new JLabel();
	
	public RadioButtonItemEventEx() {
		setTitle("라디오버튼 ItemEvent 예졔");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[2].setSelected(true);
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250, 200);
		setVisible(true);
		
	}
	
	class MyItemListener implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			} else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			} else {
				imageLabel.setIcon(image[2]);
			}
				
		}
		
	}

	public static void main(String[] args) {
		new RadioButtonItemEventEx();

	}

}

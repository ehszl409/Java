package catchmindDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

public class DesignRoom extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignRoom frame = new DesignRoom();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DesignRoom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(718, 6, 276, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea taUserList = new JTextArea();
		taUserList.setText("[Post Malone] [Drake]");
		taUserList.setBounds(6, 6, 264, 59);
		taUserList.setBackground(new Color(255, 255, 255));
		taUserList.setRows(5);
		taUserList.setColumns(15);
		panel.add(taUserList);
		
		JTextArea taChat = new JTextArea();
		taChat.setText("[서버] PostMalone님이 입장하셨습니다.");
		taChat.setForeground(new Color(0, 0, 0));
		taChat.setBounds(-1, 70, 271, 285);
		taChat.setBackground(new Color(255, 255, 255));
		taChat.setRows(17);
		taChat.setColumns(15);
		panel.add(taChat);
		
		textField = new JTextField();
		textField.setBounds(9, 360, 261, 26);
		textField.setBackground(new Color(204, 204, 204));
		panel.add(textField);
		textField.setColumns(15);
		
		JButton btnNewButton = new JButton("준비");
		btnNewButton.setBounds(6, 398, 175, 56);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나가기");
		btnNewButton_1.setBounds(193, 398, 77, 56);
		panel.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(6, 6, 700, 68);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Room");
		lblNewLabel.setBounds(6, 5, 100, 20);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("제시어");
		lblNewLabel_1.setBounds(311, 5, 51, 60);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("넘기기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(605, 5, 89, 50);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(6, 398, 700, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("RED");
		rdbtnNewRadioButton.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("ORANGE");
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("YELLOW");
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("GREEN");
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("BLUE");
		panel_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("DEEPBLUE");
		panel_1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("PURPLE");
		panel_1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("BLACK");
		panel_1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("ERASER");
		panel_1.add(rdbtnNewRadioButton_7);
	}
}

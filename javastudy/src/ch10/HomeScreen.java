package ch10;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Data;


public class HomeScreen extends JFrame {
	
	private HomeScreen homeScreen = this;
	private LoginScreen loginScreen;
	
	private JLabel laUsername;
	
	public HomeScreen() {
		this(null);
	}
	// context를 넘겼다.
	public HomeScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
		laUsername = new JLabel(loginScreen.getTfUsername().getText());
		
		setTitle("Home");
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(laUsername, BorderLayout.CENTER);
		
		setVisible(true);
	}

}

package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class LoginScreen extends JFrame{
	// GUI할 때 항상 heap공간에 만들어 놓는것이 좋다.
	// 자기자신을 this로 명시해 놓은 것인데, 왜냐하면 
	// 익명 클래스를 사용하면 this를 사용하면 인터페이스를 구현하고 있는 클래스를
	// 가리키기 때문이다. 이 와 비슷한 개념을 context라고 한다.
	// context = 스토커 heap에 접근 할 수 있는 참조 값을 통채로 넘기는 것.
	private LoginScreen loginScreen = this; 
	private JTextField tfUsername;
	private JButton btnLogin;
	
	public LoginScreen() {
		tfUsername = new JTextField("");
		btnLogin = new JButton("Login");
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이벤트 분배 스레드를 끄는 함수.
		setSize(400, 500);
		
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		
		initListener();
		
		
		
		setVisible(true);
	}
	
	// Listener 등록 모아두기 (웬만하면 익명으로 하자)
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				if(username.equals("ssar")) {
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false);
				} else {
					System.out.println("로그인 실패 : 아이디를 다시 입력해주세요.");
				}
				
			}
		});
		
	}

	public LoginScreen getLoginScreen() {
		return loginScreen;
	}

	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}

	public JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}

	
	
}

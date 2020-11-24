package ex02;

public class Facebook extends OAuth{
	private String name;
	private int pass;
	private String email;
	
	public Facebook() {
		this("Shinyul", 1234, "ehszl409");
	}

	public Facebook(String name, int pass, String email) {
		
		this.name = name;
		this.pass = pass;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	String printid() {
		return name;
	}
	
	int printpass() {
		return pass;
	}
	
	String printemail() {
		return email;
	}
	
	
	

}

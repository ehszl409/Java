package ex02;

public class Naver extends OAuth{
	private String Id;
	private int password;
	private String email;
	
	public Naver() {
		this("Parks", 1234, "TKasl");
	}

	public Naver(String id, int password, String email) {
		Id = id;
		this.password = password;
		this.email = email;
	}
	
	String printid() {
		return Id;
	}
	
	int printpass() {
		return password;
	}
	
	String printemail() {
		return email;
	}
	

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
		
	
	
	

}

package ch06;

class User2 {
	private int id;
	private String username;
	private String password;

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "안녕";
//	}
	

	public User2(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User2 [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}

public class Object04 {
	public static void main(String[] args) {
		User2 user = new User2(1, "ssar", "1234");
		// java에서 레퍼런스를 출력하면 오브젝트가 들고있는 toString()이 자동으로 출력된다.
		System.out.println(user);
		
		String s = "안녕";
		System.out.println(s);

	}
}

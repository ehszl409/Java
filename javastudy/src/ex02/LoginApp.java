package ex02;

public class LoginApp {
	
	public static void userInfo(OAuth o) {
		System.out.println(o.printemail());
		System.out.println(o.printid());
		System.out.println(o.printpass());
		
	}

	public static void main(String[] args) {
		Facebook f = new Facebook();
		Naver n = new Naver();
		
		userInfo(f);
		userInfo(n);
		
	}

}

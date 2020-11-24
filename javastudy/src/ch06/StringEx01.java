package ch06;

public class StringEx01 {

	public static void main(String[] args) {
		String a = "My name is Tom";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ' ') count++;
		}
		System.out.println(count);
	}

}

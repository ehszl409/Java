package ch06;

public class Object02 {

	public static void main(String[] args) {
		String str = "호길동";
		System.out.println(str.hashCode());

		String str2 = "호길동";
		System.out.println(str.hashCode());
		
		str = "임꺽";
		System.out.println(str.hashCode());
		
	}

}

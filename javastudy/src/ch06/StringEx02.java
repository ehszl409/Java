package ch06;

public class StringEx02 {

	public static void main(String[] args) {
		String s = "AbCDEFg";
		System.out.println(s.toLowerCase());
		System.out.println("//////////////////");
		
		char[] data = {'a', 'b', 'c', 'd'};
		String str1 = new String(data);
		String str3 = new String(str1);
		//String str4 = 'a';
		
		System.out.println(str1);
		System.out.println(str3);
		System.out.println("//////////////////");
		
		System.out.println("java"+3.14+false+'a');
		

	}

}

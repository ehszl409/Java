package ch06;

public class Object03 {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		// == 은 최소 엑세스한 메모리 공간의 내용을 비교. 
//		(str은 주소값을 비교, int는 값을 비교한다.)
		System.out.println(str1 == str2);  
		
		// String의 hash함수는 오버라이딩되서
		// 같은 문자열이면 같은 hash를 뽑아낸다.
		String str3 = "임꺽정"; // heap내부의 Constant Pool
		String str4 = new String("임꺽정"); // heap
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// 서로 다른 주소 이다.
		System.out.println(str3 == str4);
		
		// ==으로 먼저 비교, 같으면 true
		// ==으로 비교했는데 false가 나오면 최종목적지 값을 비교.
		System.out.println(str3.equals(str4));

	}

}

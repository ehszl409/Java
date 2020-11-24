package ch06;

public class Wrapper01 {

	public static void main(String[] args) {
		
		// 기본타입을 Wrapper로 바꾸는 이유는
		// Wrapper의 함수를 사용하고 싶기 때문이다.
		
		// 숫자를 문자로 바꾸는 방법.
		// 1. int를 Integer 클래스로 웹핑한다.
		Integer num2 = 20;
		String num3 = num2.toString();
		System.out.println(num3);
		
		// 2. 기본타입으로 호출 할 경우. 
		int num = 10;
		String num4 = num+"";
		
		// 문자를 숫자로 바꾸는 방법.
		// 통신할 때는 값을 전부 String으로 받아온다.
		String num5 = "10";
		// 너무 많이 사용하는 함수여서 Static으로 선언되어있다.
		// Integer.parseInt();는 외우자.
		int num6 = Integer.parseInt(num5); 
		System.out.println(num6);
	}

}

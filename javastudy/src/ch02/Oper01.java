package ch02;

public class Oper01 {

	public static void main(String[] args) {
		System.out.println(1+1); // 연산
		System.out.println(1+"1"); // 결합
		
		int num = 10;
		String s = "5";
		
		
		String sum = num + s; // 타입이 스트링으로 됨 (int로 못 받는다)
		System.out.println(sum);
		
		System.out.println(10-5);
		System.out.println(10/3); // 타입이 int로 됨
		System.out.println(10.0/3); // 타입이 double 타입이 큰쪽으로 간다
		System.out.println(10%3);

	}

}

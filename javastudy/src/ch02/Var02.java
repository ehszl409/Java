package ch02;

public class Var02 {

	public static void main(String[] args) {
		// code 부분
		int num = 10; //4byte - 32bit - 42억 9천(-20억 ~ +20억)
		long num2 =100; //8Byte 경 까지 저장 
		
		char s = '가'; //2Byte (중국어 저장 못함)
		
		
		double d = 7.5;//8Btye 42억 9천(-20억 ~ +20억 추가로 소수점 이하까지 가능)
		boolean b = true; //1Byte
		
		num = (int)num2; //8개의 공간인 long을 4개의 공간인 int에 넣는건 안된다 명시적 형변환(다운 캐스팅)
		num2 = num; //묵시적 형변(업 캐스팅)
		num = (int)d; //명시적 형변환(다운 캐스팅 - 자료 유실)
		// end of main
		System.out.println();
	}

}

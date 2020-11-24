package ch03;

public class For02 {

	public static void main(String[] args) {
		// 짝수 1 ~ 100까지
		for (int i = 1; i < 101; i++) {
			if (i%2 == 0) {
				System.out.println("2의 배수 : " + i);				
			}
			
			if (i%2 == 1) {
				System.out.println("홀수 : " + i);
			}
			
		}

	}

}

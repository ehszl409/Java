package ch03;

public class For01 {

	public static void main(String[] args) {
		// 반복문 -> 스택이 반복되는 것.
		// 초기값은 i = 1
		// 조건식은 i 가 5보다 작을 때까지 반복하고
		// 스택은 한 번 종료될 때 마다 i가 1씩 증가.
		
		// 첫 번째 루프는 초기값 설정 및 조건 확인
		// 두 번째 루프 부터는 i값 변경 후 조건 확인(반복)
		for(int i=1; i<5; i++) {
			System.out.println("숫자 : " + i);
		}
		System.out.println();
		
		for (int i = 4; i >= 1; i--) {
			System.out.println("숫자 : " + i);
		}
		System.out.println();
		
		for (int i = 1; i < 101; i+=2) {
			System.out.println("숫자 : " + i);
		}
		
		System.out.println("3의 배수 출력");
		for (int i = 0; i < 100; i+=3) {
			System.out.println("3의 배수 : " + i);
			
		}

	}

}

package review;

public class Ex09 {
	
	// stack : 함수마다 가지고 있음.
	// 오픈 : 함수의 호출시.
	
	void add() { // 함수 내부 = 중괄호 내부 = {  } = Stack이 오픈된다고 함.
		int n1 = 10; // add() 함수 stack에 4Byte가 할당됨.
	}// 함수 종료 => 점프 후 복귀 = stack이 사라짐 = 변수가 지역적 = 지역변수.
	// int로 return값을 주는 것은 메모리 공간을 넘겨주는 것이 아니라
	// Call By Value로 Value로 리턴해주는 것이다.
	
	public static void main(String[] args) {
		Ex09 e = new Ex09();
		e.add(); // n1 메모리가 떠있다.

	}

}

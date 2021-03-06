package ch04;

//프로그램이 실행되면 cal - add, minus 와 Method - main이 static 공간에 저장된다 
class cal{ // calculator
	
	static void add(int n1, int n2) {// n1, n2는 지역변수로 add()함수가 실행되면 생성됐다가 끝나면 사라진다 
		System.out.println(n1+n2); // 호출시에 잠시 stack공간에 떳다가 사라진다
	}
	
	static int minus(int n3, int n4) {
		return n3-n4; //n3 - n4의 값만 return되는 것이다 변수 자체가 리턴되는 것이 아니다 
	}
	
}

public class Method03 {
	public static void main(String[] args) {	
		cal.add(5,6); // 호출시에 잠시 stack공간에 떳다가 사라진다 cal.add로 점프한다
		
		//minus 함수는 return 타입이 int이기 때문에 
		//cal.minus(10, 4)가 호출된 후 메서드가 종료되면
		//cal.minus(10, 4)가 int값 6으로 변경된다 
		int result = cal.minus(10, 4); // static으로 메모리상에 띄우고 return되는 값을 int result 값으로 받아줘야 한다 
		System.out.println(result);
	}// main()가 끝나면 Heap 과 Stack의 값을 모두 지운다

}

package review;

/**
 * 
 * @author shinyulpark
 *	static은 main이 시작하기 전에 메모리에 로딩된다.
 *	그 말은 static 데이터는 중복될 수 없다. 단 한번만 메모리에 로딩되기 때문.
 *	두개가 메모리에 뜰 수 없음. => static 데이터는 공유될 수 있는 데이터.
 *
 *	heap은 new할 때 메모리에 뜬다.타이밍이 무조건 static보다 늦음.
 *	개발자가 원하는 만큼 메모리에 로딩할 수 있다.
 *	공유 데이터가 아니라 각 각이 데이터를 따로 가지고 있음.
 *	자동차 공장에서 소나타를 3대를 찍어내서 판매를 하면 3개의 소나타는 모두 다른 소나타
 */
public class Ex08 {
	
	// void는 리턴이 없다. add는 변수이름, ()함수라는 뜻
	// int n1, int n2 매개변수(arguments)
	void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	int minus(int n1, int n2) {
		return n1-n2; // 함수를 호출한 문장의 값이 n1-n2로 변경됨.
	}
	
	public static void main(String[] args) {
		Ex08 e = new Ex08();
		e.add(3, 2); // 함수의 호출(29번 라인에서 19번 라인으로 점프 후 다시 30번 라인으로돌아옴)
		int result = e.minus(10, 5); // int result = 5;
		System.out.println(result);
	}

}

package ch05;

// 다형성을 성립하는 상속.
class 지구인{
	String name = "지구인";
}

class 한국인 extends 지구인{
	String name = "한국인";
}

class 부산인 extends 한국인{
	String name = "부산인";
}

public class Inherit02 {

	public static void main(String[] args) {
		// Heap 공간에 2개가 떳다.
		// Heap (한국인, 지구인) -> 포인터(지구인)
		지구인 b = new 한국인();
		System.out.println(b.name);
		
		// 유전적 다운 캐스팅 Heap공간에 떠있는 한국인 공간을
		// 포인터 가르키게 만든다
		// 1.b는 한국인(자식), 지구인(부모)이 메모리에 다 있기
		// 때문에 다운 캐스팅 가능.
		한국인 h = (한국인)b;
		
//		try {
//			부산인 busan = (부산인) b;
//		} catch (Exception e) {
//			// 개발자가 핸들링 할 수 있음. (로그 파일)
//			System.out.println("오류 발생했는데 무시해도 돼");
//		}
		

	}

}
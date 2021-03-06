package review;


// 자바는 함수만 만들수가 없다.
// 더하기 함수를 만들고 싶다 => 더하기 함수를 만들려면 클래스가 필요함.

// 상태가 없는 메서드는 개념적으로 잘 못 됐다.

class Storage{
	String data;
	
	String download() {
	
		try { // 인터럽스가 발생해서 우선순위가 밀릴 수 도 있다.
			Thread.sleep(3000); // 동기적 프로그램.
		} catch (InterruptedException e) {
			System.out.println("fine");
		} // 1000 = 1초 
		return data;
	}
}
// 자바는 메서드를 함수의 매개변수로 전달할 수 없음.
// 자바는 메서드를 함수의 매개변수로 전달하고 싶으면 무조건 인터페이스에 함수를 담아요.
// 익명클래스로 넘긴다.
public class Ex122 {

	public static void main(String[] args) {
		Storage s = new Storage();
		String game = s.download();
		System.out.println(game + "실행");
	}

}

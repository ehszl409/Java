package ch13;

// 새로운 스레드를 만드는 방법. Thread를 상속 받거나 Runnable을 implement해서
// 추상 메서드 run을 구현하면 된다.
// implements Runnable 하는 것이 좋다. 실수를 예방하기 위해서.
class Another extends Thread { // Runnable 타입이 되어야 함. Thread가 Runnable을 
	//implement 하고 있다.
	
	// 필수적으로 run이라는 추상 메서드를 구현해야함 
	// 실행단위 코드 블럭 = Stack(Thread)
	@Override
	public void run() {
		System.out.println("새로운 스레드 실행됨");
		for (int i = 0; i < 11; i++) {
			try {
				System.out.println("Run : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초
		}
		System.out.println("새로운 스레드 종료");
	}
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("main스레드 실행됨");
		
		// 새로운 스래드를 실행.
		// 1. 스레드 객체 생성 2. 타겟 설정
		Thread t1 = new Thread(new Another());
		
		// 3. 실행 (콜백) JVM에게 run을 때려달라고 한다.
		// 그리고 main 스레드는 39번 줄로 내려가서 계속 코드를 실행한다.
		t1.start();
		
		// 이 후 context swiching을 통해 왔다 갔다 하면서 실행 된다.
		// 이 과정이 매우 빨라 동시에 실행되는 것 처럼 보인다.
		// 이런 스레드는 UX에서만 사용한다. 비효율적이기 때문이다.
		for (int i = 0; i < 11; i++) {
			try {
				System.out.println("main : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초
		}
		System.out.println("main 스레드 종료");
	} // end of main

}

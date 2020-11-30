package ch13;

class NewThread extends Thread {
	@Override
	public void run() {
	

	
	}
}

public class Thread02 {

	public static void main(String[] args) {
		// 1. 스레드 객체 생성.
		// 2. 타겟 설정.
		// 3. 실행.
		Thread t1 = new Thread(new NewThread());
		t1.start();
		
		// 타켓 클래스가 스레드를 상속 받고 있고
		// 클래스 자체가 타켓이라서 타켓칸을 비워도 된다.
		// 이렇게도 많이 사용하지만 자제하자.
		NewThread t2 = new NewThread();
		t2.start();

	}

}

package ch13;

public class Thread03 {
	static int sum = 0;

	static class NewThread implements Runnable {

		@Override
		// 너무 빨리 동작하기 때문에 CS를 확인할 수가 없다.
		public void run() {
			System.out.println("새로운 스레드 시작");
			for (int i = 1; i < 11; i++) {
				sum = sum + 10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			System.out.println("새로운 스레드 끝");
		}
	}

	public static void main(String[] args) {
		System.out.println("main스레드 시작");
		Thread th1 = new Thread(new NewThread());
		th1.start();
		
		// join이 없으면 메인스레드가 sum값을 바꾸기 전에 출력을 해버려서
		// 0 의 값이 출력된다
		try {
			th1.join(); // th1이 끝날 때 까지 대기한다. (동기적으로 바꾼다)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);

		System.out.println("main스레드 종료");
	}

}

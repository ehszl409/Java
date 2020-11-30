package ch13;

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard(); // 집계판 공유 데이터 설정
		
		// 스레드 생성 시 집계판의 주소를 알려준다. 두 스레드는 집계판에 동시에 접근한다.
		Thread th1 = new StudentThread("Park", board);
		Thread th2 = new StudentThread("Shin", board);
		
		// 두 스레드 실행시킨다.
		th1.start();
		th2.start();

	}

}

// 공유데이터인 집계판을 시뮬레이션하는 클래스
// 두 StudentThread 스레드에 의해 동시 접근됨.
class SharedBoard {
	private int sum  = 0; // 집계판의 합
	
	// synchronized로 인해 park가 add()함수를 10번 돌릴 때 까지 shin이 add()함수를 실행할 수 없다.
	// synchronized로 임계 구역을 만들고 CS와 타이밍이 맞지 않으면 다른 스레드가 영원히 들어올 수 없다.
	// 그래서 Thread.yield로 양보하게 했다???
	synchronized public void add() {
		int n = sum;
		Thread.yield(); // 현재 실행 중인 스레드 양
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}

// 학생을 시뮬레이션하는 스레드 클래스
class StudentThread extends Thread {
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	// 집계판을 10번 접근하여 카운팅한다.
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			board.add();
		}
		
	}
	
}

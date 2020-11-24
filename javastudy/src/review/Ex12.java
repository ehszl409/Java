package review;

// Tv4대, 삼성, 엘지, 대우, 일렉트론

// 인터페이스와 상속의 차이는 강제성을 부여하는 것이다.
// 개념적인 차이는 상속

// 강제성 부여
// 사용자에게 편리한 인터페이스 제공.
interface Remocon{
	void change();
}

class SamsungRemocon implements Remocon{
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("SS 채널 변경");
	}
	
}

class LGRemocon implements Remocon {
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("LG 채널 변경");
	}
}

public class Ex12 {
	
	static void 채널변경(Remocon r) {
		r.change();
	}

	public static void main(String[] args) {
		채널변경(new SamsungRemocon());
		
		// 익명클래스
		Remocon r = new Remocon() {
			
			@Override
			public void change() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}

}

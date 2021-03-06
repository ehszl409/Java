package star1;

class River {
	// 1. 상태를 만든다.
	String name; // final 메모리 공간을 읽기 전용으로 변경한다.
	int hp;
	int attack;
	
	// 2. 초기화를 위한 생성자를 만든다.
	// 마법을 방지하기 위해서.
	public River(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
	
	// 3. 디폴트 생성자를 직접 만들어 준다.
	// 생성자가 이미있어서 컴파일러가 자동으로 만들어 주지 않는다.
	public River() {
	
	}
	
	// 4. 변수의 값을 변경하거나 확인하는 행위가 필요.
}

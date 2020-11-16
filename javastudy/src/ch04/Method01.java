package ch04;

// 코드가 실행되면 Method01 - add와 main이 저장된다 

public class Method01 {
	
	static void add() {
		System.out.println("add함수 호출됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출됨");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method01.add();
		Method01 m = new Method01(); //static이 아닌 sound만 Heap공간에 저장된다 
		m.sound(); // m 변수를 호출시 자동완성에서 sound만 검색된다 add는 static에 Method01 - add()로 저장되어 있기 때
	}

}

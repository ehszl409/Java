package ch05;

// 인터페이스는 new를 할 수 없다. 왜냐면 추상메서드를 가졌기 때문에
interface Animal2{
	// 추상 메서드 (함수에 몸체가 없다.)
	void sound();
}

// Animal2가 들고 있는 함수를 구현(implements)한다.
class Dog2 implements Animal2{

	public void sound() {
		System.out.println("멍멍");
		
	}
	
}

class Cat2 implements Animal2{
	
	public void sound() {
		System.out.println("야옹");
		
	}
}

class Bird2 implements Animal2{
	
	public void sound() {
		System.out.println("짹짹");
		
	}
}

class Monkey implements Animal2 {
	
	@Override
	public void sound() {
		System.out.println("몽몽");
		
	}
	
}
public class Inherit04 {
	
	static void start(Animal2 a) {
		a.sound();
	}

	public static void main(String[] args) {
		// 자기 자신의 클래스의 static을 호출할 때는 클래스명 생략 가능
		// 부모 인터페이스랑 자식 클래스가 Heap공간에 같이 뜬다.
		Dog2 d = new Dog2();
		start(d);
		start(new Cat2());
		start(new Bird2());
		start(new Monkey());
		

	}

}

package ch04;

class Car {
	String desc = "소나타의 부모입니다.";
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car");
		
	}
	
}

class Sonata extends Car{
	public Sonata() {
		super();
		
		System.out.println(super.desc);
		System.out.println("Sonata");
	}
}

public class Super01 {

	public static void main(String[] args) {
		new Sonata();

	}

}

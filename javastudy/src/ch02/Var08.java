package ch02;

// Heap 
class Zealot {
	String name ="Zealot";
	int attack = 10;
	int armor = 5;
	
	static int HP = 100;
}

public class Var08 {

	public static void main(String[] args) {
     // class address = Heap create
		Zealot z = new Zealot();// 크기를 알 수 없으므로 레퍼런스(참조)자료형이다 
		System.out.println(z.armor);
		System.out.println(z.attack);
		System.out.println(z.name);
		
		z.attack = 50;
		
		Zealot z2 = new Zealot();
		System.out.println(z2.attack);
		System.out.println(z.attack);
		
		Zealot.HP = 50; // static 변수는 Heap으로 만든 주소가 아닌 class 명으로 호출하는 것이 옳다 
		
		System.out.println(Zealot.HP);
		System.out.println(Zealot.HP);
		
		// 포지 업그레이드
		z.attack = 11;
		System.out.println(z2.attack);
		System.out.println(z.attack);
	}

}

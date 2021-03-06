package star1;

// 1. Zealot, Dragoon, Tank, Scv, DarkTemoler -> StarUnit 타입 일치


public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		//u2.hp = u2.hp - u1.attack; // hp : 90  함수로 접근하도록 한다.
		System.out.println(u1.getName() + " -> " + u2.getName() + " Attack");
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName() + " hp : " + u2.getHp());

		
	}
	// 상속
	public static void attack(StarUnit02 u1, StarUnit02 u2) {
		//u2.hp = u2.hp - u1.attack; // hp : 90  함수로 접근하도록 한다.
		System.out.println(u1.getName() + " -> " + u2.getName() + " Attack");
		u2.setHp(u2.getHp() - u1.getAttack());
		System.out.println(u2.getName() + " hp : " + u2.getHp());

		
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("Zealot", 100, 10);
		Dragoon d1 = new Dragoon("Dragoon", 100, 20);
		Darktempler dt1 = new Darktempler("Darktempler", 100, 50);
		Marine m1 = new Marine("Marine", 100, 5);
		
		//상속
		Scv s1 = new Scv("Scv", 100, 5);
		Tank t1 = new Tank("Tank", 150, 30);
		
		
		attack(z1, d1);
		attack(dt1, m1);
		attack(s1, t1);

	}

}

//package star1;
//
////오버로딩 : 함수의 이름이 같더라도 
////매개 변수의 타입의 위치, 개수, 속성중 하나라도 다르다면 함수명이 같아도 된다.
//public class Star1App {
//
//	// Zealot1 -> Dragoon1
//	static void attack(Zealot u1, Dragoon u2) {
//		System.out.println(u1.name + " -> " + u2.name + " Attack");
//		u2.hp = u2.hp - u1.attack; // hp : 90
//		System.out.println(u2.name + " hp : " + u2.hp);
//
//	}
//
//	// Dragoon1 -> Zealot1
//	static void attack(Dragoon u1, Zealot u2) {
//		System.out.println(u1.name + " -> " + u2.name + " Attack");
//		u2.hp = u2.hp - u1.attack; // hp : 90
//		System.out.println(u2.name + " hp : " + u2.hp);
//
//	}
//
//	// Dragoon1 -> Dragoon2
//	static void attack(Dragoon u1, Dragoon u2) {
//		System.out.println(u1.name + " -> " + u2.name + " Attack");
//		u2.hp = u2.hp - u1.attack; // hp : 90
//		System.out.println(u2.name + " hp : " + u2.hp);
//
//	}
//
//	// Darktempler1 -> Zealot1
//	static void attack(Darktempler u1, Zealot u2) {
//		System.out.println(u1.name + " -> " + u2.name + " Attack");
//		u2.hp = u2.hp - u1.attack; // hp : 90
//		System.out.println(u2.name + " hp : " + u2.hp);
//
//	}
//
//	// Darktempler1 -> Dragoon1
//	static void attack(Darktempler u1, Dragoon u2) {
//		System.out.println(u1.name + " -> " + u2.name + " Attack");
//		u2.hp = u2.hp - u1.attack; // hp : 90
//		System.out.println(u2.name + " hp : " + u2.hp);
//
//	}
//
//	public static void main(String[] args) {
//		Zealot z1 = new Zealot("Zealot1", 100, 10); // z1은 지역 변수 이다
//		Dragoon d1 = new Dragoon("Dragoon1", 100, 20);
//		Dragoon d2 = new Dragoon("Dragoon2", 100, 20);
//		Darktempler t1 = new Darktempler("Darktempler", 100, 50);
//		Darktempler t2 = new Darktempler("Darktempler", 100, 50);
//
//		// 1. Zealot1 -> Dragoon1
//		attack(z1, d1);
//		System.out.println();
//
//		// 2. Dragoon1 -> Zealot1
//		attack(d1, z1);
//		System.out.println();
//
//		// 3. Dragoon1 -> Dragoon2
//		attack(d1, d2);
//		System.out.println();
//
//		// 4. Darktempler1 -> Zealot1
//		attack(t1, z1);
//		System.out.println();
//		
//		// 5. Darktampler2 -> Dragoon1
//		attack(t2, d1);
//		System.out.println();
//	}
//
//}

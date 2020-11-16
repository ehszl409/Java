package ch04;

// 메서드안에 메서드를 정의할 수 없다
public class Method04 {
	
	int money = 1000;
	
	int add(int num) { // Stack 속에는num 뿐 Heap공간에 money가 존재한다 
		int money2 = money + num;
		return money2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m = new Method04(); // Heap공간에 money변수와 add()함수명이 떳다(add()함수 속 매개변수는X)
		int money2 = m.add(50000);
		System.out.println(money2);
		System.out.println(m.money);
	}

}

package ex01;

public class Ex02 {
	static int a;
	static int getA() {
		return a;
	}
	
	int b;
	int getB() {
		return b;
	}
	
	int f() {
		return getA();
	}
	
	// getB를 return 해주는 메서드가 static인데 getB와 return값 b는 static공간에 뜨질않아서
//	// 찾지를 못한다.
//	static int g() {
//		return getB();
//	}
}

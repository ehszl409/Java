package ex01;

class StaticSample{
	int x;
	static int y;
	static int f() {
		return y;
	}
}

public class Ex03 {

	public static void main(String[] args) {
//		StaticSample.x = 5; // x는 new를 통해 Heap 공간에 띄워야 된다
		StaticSample.y = 10;
		int imp = StaticSample.f();
		System.out.println("imp : "+imp);
		StaticSample a = new StaticSample();
		imp = StaticSample.y;
		System.out.println("imp : "+imp);
		

	}

}

package test;

import ch05.BlueCloth;
import ch05.Factory;

// protected 는 같은 패키지 + 자식만 상-090 
public class FactoryApp {

	public static void main(String[] args) {
		Factory f1; 
		f1 = new BlueCloth();
		// protected로 접근 불가
//		f1.print(); // 동적 바인딩
//		f1.dry();
		
		// public으로 순서를 제한한 메서드
		f1.runnig();

	}

}

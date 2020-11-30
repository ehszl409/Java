package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		// ArrayList는 List의 자식이기 때문에 List를 사용한다 또는 Collection을 사용해도 된다.
		// 이 코드가 바람직하다. 보통 Collection 말고 List에서 멈춘다.
		// 버전이 낮은 자바에서는 new ArrayList<String>을 넣어 줘야한다.
		List<String> list1 = new ArrayList<>();
		list1.add("apple");
		list1.add("strberry");
		
		// 컬렉션의 사이즈를 찾을 때마다 점프를 해야하기 때문에 변수에 사이즈값을
		// 변수에 넣어서 사용하는 것이 바람직하다.
		int size = list1.size();
		// 배열은 .length 컬렉션은 size()
		for (int i = 0; i < size; i++) {
			System.out.println(list1.get(i));
		}
		
		list1.add("banana");
		System.out.println("2:"+list1.get(2));
		
		// 1번지에 strberry를 밀어내고 melon을 삽입한다.
		// 이 과정은 주소값만 변경하기 때문에 두번의 연산으로 삽입이 가능하다.
		list1.add(1, "melon");
		System.out.println("1:"+list1.get(1));
		
		list1.remove(1);
		System.out.println("1:"+list1.get(1));
		
		list1.clear();
		System.out.println("size:"+list1.size());
	}

}

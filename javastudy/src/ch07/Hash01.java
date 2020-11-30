package ch07;

import java.util.HashMap;

public class Hash01 {

	
	
	public static void main(String[] args) {
		// 해쉬맵은 Key, value로 값을 입력할 수 있다.
		// 찾을 때는 key값으로 찾을 수 있다.
		// 만약 new객체 생성시 String이나 int값 모두를 넣고 싶으면 <String, Object>라고 한다.
		HashMap<String, String> hash = new HashMap<>();
		
		hash.put("name", "park");
		hash.put("username", "ssar");
		hash.put("phone", "01022227777");
		
		// 받는 타입을 Object로 설정해놨다.
		System.out.println(hash.get("phone")); 
		System.out.println(hash.containsKey("name"));
		System.out.println(hash.containsValue("park"));

	}

}

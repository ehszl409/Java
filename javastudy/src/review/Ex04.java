package review;

import lombok.Data;

@Data // to.String()이 오버라이딩됨. Getter Setter가 만들어짐.
// 커스텀 자료형 (오브젝트)
class Product {
	private int no; // 상품번호
	private int price; // 상품가격
	private String name; // 상품이름
}

public class Ex04 {
	public static void main(String[] args) {
		// 클래스 자료형 (여러가지 데이터 타입이 섞여 있을 때.)
		Product t1 = new Product();
		System.out.println(t1);
	}
}

package coffee;

//고객
//책임 : 주문, 먹기
public class Customer {
	
	// 협력의 관계 때문에 매개 변수로 받는다.
	public void order(Barista b1) {
		// Barista에게 메세지를 보냄.
		Coffee c = b1.makeCoffee();
		System.out.println(c.getName()+"이(가) 나왔습니다.");
		
	}

}

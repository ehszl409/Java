package coffee;

//바리스타
//책임 : 커피제조
public class Barista {
	
	// Barista의 책임.
	// 응답시에는 레퍼런스를 몰라도 된다.
	public Coffee makeCoffee() {
		return new Coffee();
	}
}

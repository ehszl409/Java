package coffee;

public class CoffeeApp {

	public static void main(String[] args) {
		Barista b1 = new Barista();
		Customer c1 = new Customer();
		
		// Customer는 Barista랑 협력
		c1.order(b1);

	}

}

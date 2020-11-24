package composite;

public class LotteriaApp {

	public static void main(String[] args) {
		Burger b1 = new BigBurger();
		Potato t1 = new Potato();
		Coke c1 = new Coke();
		System.out.println();
		
		BurgerSet bs1 = new ShrimpBurgerSet();
		System.out.println();
		
		BigBurger bbg1 = new BigBurger();
		System.out.println();
	}

}
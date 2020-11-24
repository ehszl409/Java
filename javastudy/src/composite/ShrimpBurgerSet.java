package composite;

public class ShrimpBurgerSet extends BurgerSet{
	
	private ShrimpBurger shrimpBurger;
	private Potato potato;
	private Coke coke;
	
	public ShrimpBurgerSet() {
		this(new ShrimpBurger(), new Potato(), new Coke());
	}
	public ShrimpBurgerSet(Burger burger, Potato potato, Coke coke) {
		super(burger, potato, coke);
	}
}

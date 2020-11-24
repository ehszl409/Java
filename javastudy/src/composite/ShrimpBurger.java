package composite;

import lombok.Data;

@Data
public class ShrimpBurger extends Burger{
	
	public ShrimpBurger() {
		this(2500, "새우버거");
	}
	
	public ShrimpBurger(int price, String desc) {
		super(price, desc);
	}
	
	
}

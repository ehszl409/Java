package ch04;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int result = c.add(10, 5);
		result = c.multi(result, 20);
		result = c.divid(result, 5);
		result = c.minus(result, 100);
		System.out.println("최종값은 :"+result);

		int result2 = c.minus(c.divid(c.multi(c.add(10, 5), 20), 5), 100);
		System.out.println(result2);
	}

}

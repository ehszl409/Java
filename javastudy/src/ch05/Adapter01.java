package ch05;

interface Knife {
	void cooking();

	void hurting();
}

// adapter : 걸러내는 것.
// adapter의 용도.
abstract class chefAdapter implements Knife{
	public void hurting() {}
}

class Beak extends chefAdapter implements Knife {
	@Override
	public void cooking() {
		// TODO Auto-generated method stub

	}
}

public class Adapter01 {
	public static void main(String[] args) {

	}
}

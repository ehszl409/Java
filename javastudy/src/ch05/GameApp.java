package ch05;

public class GameApp {
	static void start(Control c) {
		c.브레이크();
		c.엑셀();
	}
	
	public static void main(String[] args) {
		Ferari f = new Ferari();
		start(f);
		

	}

}

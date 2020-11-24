package ch05;

public abstract class Factory {
	protected abstract void print();
	protected void dry() {
		System.out.println("dry complete");
	}
	
	public void runnig() {
		print();
		dry();
	}
}

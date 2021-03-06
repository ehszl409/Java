package ex01;

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle() {
	}

	Rectangle(int x, int y, int width, int height) {	
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return this.width * this.height;
	}
	
	void show() {
		System.out.println("("+this.x+","+this.y+")"+"에서 크기가 "+this.width+"x"+this.height+"인 사각형");
	}
	
	boolean contains(Rectangle r) {
		if( (this.x < r.x  && this.y < r.y) &&  
				(r.x + r.width < this.x + this.width && r.y + r.height < this.y + this.height) ) {
			return true;
		}
		else return false;
	}
	
	

}

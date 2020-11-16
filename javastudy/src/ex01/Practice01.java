package ex01;

class TV {
	private String name;
	private int date;
	private int inch;
	
	TV() {
		// TODO Auto-generated constructor stub
	}

	TV(String name, int date, int inch) {
		this.name = name;
		this.date = date;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(this.name+"에서 만든"+this.date+"년형"+this.inch+"인치 TV");
	}
	
}

package ch09;

// 복잡한 값을 저장해야하면 enum을 사용하면된다.
public enum MyLayout {
	WEST("West"),
	EAST("East"),
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center");
	
	
	
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private MyLayout(String value) {
		this.value = value;
	}
	
	
}

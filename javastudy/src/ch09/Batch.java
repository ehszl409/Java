package ch09;

// 변수 : Public static final 이 생략되어 있음. 상수는 무조건 대문자 규칙.
// 실수 방지하기 위해서 만든 인터페이스.
// 컴파일시 오류는 잡기 쉽다.
public interface Batch {
	String EAST = "East";
	String WEST = "West";
	String SOUTH = "South";
	String NORTH = "North";
	String CENTER = "Center";
}

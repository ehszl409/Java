package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		// 기본 생성자 -> 클래스명() -> 생략가능하다.
		Person p1 = new Person("최스희", "의사", 45, '여', "a");
		Person p2 = new Person("이미녀", "골프 선수", 25, '여', "a");
		Person p3 = new Person("이미남", "야구선수", 45, '남', "a");
		
		p1.preview();
		p2.preview();
		p3.preview();

	}

}




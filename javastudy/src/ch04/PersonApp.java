package ch04;

public class PersonApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "최승희";
		p1.jop = "의사";
		p1.age = 19;
		p1.gender = '여';
		p1.blood = "A";
				
		p1.preview();
		
		Person p2 = new Person();
		p2.name = "이미녀";
		p2.jop = "골프 선수";
		p2.age = 29;
		p2.gender = '여';
		p2.blood = "B";
		
		p2.preview();
		
		Person p3 = new Person();
		p3.name = "이미남";
		p3.jop = "야구 선수";
		p3.age = 30;
		p3.gender = '남';
		p3.blood = "AB";
		
		p3.preview();
		

	}

}

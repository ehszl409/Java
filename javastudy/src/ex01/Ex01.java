package ex01;

class Person {
	private int age;

	Person(int age) {

		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	Person() {

	}

}

public class Ex01 {

	public static void main(String[] args) {
		Person a = new Person();
		a.setAge(17);
		int age = a.getAge();
		System.out.println(age);
	

	}

}

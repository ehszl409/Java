package ch02;

//자바는 .class파일을 실행하면 static부분을 메모리에 로드한다(static공간)
//static 공간에 있는 main()함수를 찾아서 호출하고
//이때 stack이 생성되는데 이 stack의 이름은 main이라고 한다
//main의 stack이 종료되면 프로그램 종료!
public class Var01 {

	public static void main(String[] args) {
		// 이제부터 모든 코드는 여기에 적는다.
		// code부분
		System.out.println("1");
		System.out.println("2");
		// end of main

	}

}

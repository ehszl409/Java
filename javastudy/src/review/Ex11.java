package review;

// 상속은 데이터를 물려주는 것이 목적이 아니다.
// 데이터를 물려주고 싶으면 콤포지션 하면 된다.
// 상속을 하는 이유는 다형성에 있음. 타입을 일치시키는 것 
// 타입을 일치시키면 공통 모듈을 만들 수 있다. (공통 함수)

class Tree {
	// 오버라이딩
	void start() {}
}

class TreeChair extends Tree{
	void start() {
		System.out.println("treechair use");
	}
}

class TreeDesk extends Tree{
	void start() {
		System.out.println("treedesk use");
	}
	
}

public class Ex11 {
	
	static void use(Tree u) {
		u.start();
	}
//	
//	// 오버로딩 (과적재)
//	static void use(TreeChair u) {
//		u.start();
//	}

	public static void main(String[] args) {
		use(new TreeDesk());

	}

}

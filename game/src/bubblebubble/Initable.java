package bubblebubble;

public interface Initable {
	void init(); // new를 담는 곳
	void setting(); // JFrame의 기본 셋팅
	void batch(); // 화면 구성을 하는 곳
	void listener(); // 리스너 (이벤트를 담는 곳)
}

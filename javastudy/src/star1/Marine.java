package star1;

class Marine {
	// field, property 는 private로 만들어 마법을 제한 한다.
	private String name;
	private int hp;
	private int attack;

	// command + shift + S
	public Marine(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public Marine() {

	}

}
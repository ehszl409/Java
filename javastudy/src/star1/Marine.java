package star1;

class Marine implements StarUnit {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	

}

package star1;

class Dragoon implements StarUnit{
	String name;
	int hp;
	int attack;
	
//	규칙 : 클래스를 생성하면 무조건 초기화를 위한 생성자를 만든다.
	public Dragoon(String name, int hp, int attack) {
	super();
	this.name = name;
	this.hp = hp;
	this.attack = attack;
}
	
	public Dragoon() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		
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
	
	

	

}

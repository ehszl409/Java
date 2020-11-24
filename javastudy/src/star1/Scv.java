package star1;

class Scv extends StarUnit02{
	private String id;
	private int hp;
	private int attack;
	
	public Scv() {
		// TODO Auto-generated constructor stub
	}

	public Scv(String id, int hp, int attack) {
		this.id = id;
		this.hp = hp;
		this.attack = attack;
	}

	public String getName() {
		return id;
	}

	public void setName(String name) {
		this.id = name;
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

package battleBots;

public class Minion {
	protected String name;
	
	protected int attack;
	
	protected int health;
	
	public Minion (final String name, final int attack, final int health){
		this.name = name;
		this.attack = attack;
		this.health = health;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String toString() {
        return "{ Name: " + this.getName() + ", Attack: " + this.getAttack() + ", Health: " + this.getHealth() + " }";
    }
}

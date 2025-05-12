package GameWarrior;

public abstract class BaseFighter implements Fighter{
	private String name;
	private int energy;
	private int health;
	
	public BaseFighter(String name, int energy, int health) {
		this.name = name;
		this.energy = energy;
		this.health = health;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public void takeDamage(int damage) {
		this.health -= damage;
		if (this.health < 0) this.health = 0; 
	}
	
	public void reduceEnergy(int amount) {
		this.energy -= amount;
		if (this.energy < 0) this.energy = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
}

package GameWarrior;

public class Knight extends BaseFighter {
	public Knight(String name) {
		super(name, 50, 90);
	}

	@Override
	public void attack(Fighter target) {
		int cost = 10;
		int damage = 20;
		int energy = this.getEnergy();
		
		if (energy >= cost && isAlive() && target.isAlive()) {
			System.out.println(this.getName() + " swings sword at " + target.getName());
			energy -= cost;
			target.takeDamage(damage);
		} else {
			System.out.println(this.getName() + " is too tired or dead!");
		}
	}

}

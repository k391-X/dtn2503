package GameWarrior;

public class Mage extends BaseFighter {
	public Mage(String name) {
		super(name, 60, 70);
	}

	@Override
	public void attack(Fighter target) {
		int cost = 15;
		int damage = 30;
		int energy = this.getEnergy();

		if (energy >= cost && isAlive() && target.isAlive()) {
			System.out.println(this.getName() + " casts fireball at " + target.getName());
			energy -= cost;
			target.takeDamage(damage);
		} else {
			System.out.println(this.getName() + " is too tired or dead!");
		}

	}

}

package GameWarrior;

public class Archer extends BaseFighter{

	public Archer(String name) {
		super(name, 40, 80);
	}
	
	@Override
	public void attack(Fighter target) {
		int cost = 7;
		int damage = 15;
		int energy = this.getEnergy();
		
		if (energy >= cost && target.isAlive() && isAlive()) {
			System.out.println(getName() + " shoots arrow at " + target.getName());
			energy -= cost;
			target.takeDamage(damage);
		} else {
			System.out.println(getName() + " is too tired or dead!");
		}
	}

}

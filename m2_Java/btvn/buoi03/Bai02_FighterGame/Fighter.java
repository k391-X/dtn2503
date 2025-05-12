package GameWarrior;

public interface Fighter {
	void attack(Fighter target);
	boolean isAlive();
	String getName();
	int getHealth();
	int getEnergy();
	void takeDamage(int damage);
}

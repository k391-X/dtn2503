package GameWarrior;

public class Main {

	public static void main(String[] args) {
		BattleField field = new BattleField();

		field.addFighter(new Knight("Arthur"));
		field.addFighter(new Archer("Robin"));
		field.addFighter(new Mage("Merlin"));

		field.startBattle();
	}

}

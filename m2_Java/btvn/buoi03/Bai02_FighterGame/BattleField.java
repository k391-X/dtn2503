package GameWarrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleField {
	private List<Fighter> fighters;

	public BattleField() {
		fighters = new ArrayList<>();
	}

	public void addFighter(Fighter f) {
		fighters.add(f);
	}

	public void startBattle() {
		Random rand = new Random();
		int round = 1;

		printAllFighterStatus();

		while (aliveFighters().size() > 1) {
			System.out.println("\n=== Round " + round + " ===");

			boolean roundExecuted = false;

			for (Fighter attacker : fighters) {
				if (!attacker.isAlive())
					continue;

				List<Fighter> targets = aliveFightersExcept(attacker);
				if (targets.isEmpty())
					break;

				Fighter target = targets.get(rand.nextInt(targets.size()));
				attacker.attack(target);
				printStatus(attacker, target);
				roundExecuted = true;
			}

			if (!roundExecuted)
				break;
			round++;
		}

		List<Fighter> alive = aliveFighters();
		if (!alive.isEmpty()) {
			System.out.println("\n🏆 " + alive.get(0).getName() + " won the battle!");
		} else {
			System.out.println("\n⚔ All the warriors have fallen.");
		}

	}

	private List<Fighter> aliveFighters() {
		List<Fighter> alive = new ArrayList<>();

		for (Fighter f : fighters) {
			if (f.isAlive())
				alive.add(f);
		}

		return alive;
	}

	private List<Fighter> aliveFightersExcept(Fighter self) {
		List<Fighter> others = new ArrayList<>();
		for (Fighter f : fighters) {
			if (f.isAlive() && f != self) {
				others.add(f);
			}
		}

		return others;
	}

	private void printStatus(Fighter f1, Fighter f2) {
		System.out.println(f1.getName() + " (HP: " + f1.getHealth() + ", EN: " + f1.getEnergy() + ")");
		System.out.println(f2.getName() + " (HP: " + f2.getHealth() + ", EN: " + f2.getEnergy() + ")");

	}

	private void printAllFighterStatus() {
		System.out.println("Fighter battle: ");
		for (Fighter f : fighters) {
			System.out.printf("- %s | HP: %d | MP: %d | %s\n", f.getName(), f.getHealth(), f.getEnergy(),
					f.isAlive() ? "🟢 Alive" : "❌ Dead");
		}
	}

}

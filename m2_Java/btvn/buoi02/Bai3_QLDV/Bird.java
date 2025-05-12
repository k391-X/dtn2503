package QLDV;

public class Bird extends Animal {
	public Bird(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " hót: Chíp Chíp!");
	}

	@Override
	public void move() {
		System.out.println(getName() + " bay trên trời.");

	}

	@Override
	public String getType() {
		return "Bird";
	}

}

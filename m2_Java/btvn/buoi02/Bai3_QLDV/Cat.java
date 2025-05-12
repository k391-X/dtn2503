package QLDV;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + " kêu: meo meo!");

	}

	@Override
	public void move() {
		System.out.println(getName() + " đi nhẹ nhàng và leo trèo.");

	}

	@Override
	public String getType() {
		return "Cat";
	}

}

package QLDV;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();
	public abstract void move();
	
	public String getName() {
		return name;
	}
	
	public abstract String getType();
}

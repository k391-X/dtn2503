package DP04_Bai05_DecoratorPattern;

public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "Cà phê đen";
	}

	@Override
	public double getCost() {
		return 20000;
	}

}

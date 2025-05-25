package DP04_Bai05_DecoratorPattern;

public class Sugar extends CoffeeDecorator {

	public Sugar(Coffee coffee) {
		super(coffee);
	}
	
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", đường";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2_000;
    }
	
}

package DP04_Bai05_DecoratorPattern;

public class Cream extends CoffeeDecorator {
    public Cream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", kem";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 4_000;
    }
}


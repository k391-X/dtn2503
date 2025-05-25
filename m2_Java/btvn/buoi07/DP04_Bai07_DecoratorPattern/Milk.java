package DP04_Bai05_DecoratorPattern;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", sữa";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 3_000;
    }
}

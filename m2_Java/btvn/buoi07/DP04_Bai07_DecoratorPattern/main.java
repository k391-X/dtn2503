package DP04_Bai05_DecoratorPattern;

public class main {

	public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new Sugar(coffee);
        coffee = new Milk(coffee);
        coffee = new Cream(coffee);

        System.out.println("Mô tả: " + coffee.getDescription());
        System.out.println("Tổng tiền: " + coffee.getCost() + " VND");
	}

}

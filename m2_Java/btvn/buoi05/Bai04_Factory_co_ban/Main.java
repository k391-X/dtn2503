package Bai04_Factory_co_ban;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = ShapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape("square");
		shape2.draw();
		
		Shape shape3 = ShapeFactory.getShape("triangle");

	}

}

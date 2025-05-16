package Bai04_Factory_co_ban;

public class ShapeFactory {
	public static Shape getShape(String type) {
		if (type == null) {
			return null;
		}
		switch (type.toLowerCase()) {
		case "circle":
			return new Circle();
		case "square":
			return new Square();
		default:
			throw new IllegalArgumentException("Unknow shape type: " + type);
		}
	}
}

package CV;

public class Main {

	public static void main(String[] args) {
		// Tạo hình tròn
		Shape circle = new Circle(5);
		
		// Tạo hình chữ nhật
		Shape rectangle = new Rectangle(4, 6);

		// Tạo tam giác
		Shape triangle = new Triangle(3,4,5);
		
		System.out.println("== Hình tròn ==");
		System.out.println(circle);
		circle.displayInfo();
		
		System.out.println("\n== Hình chữ nhật ==");
		System.out.println(rectangle);
		rectangle.displayInfo();
		
		System.out.println("\n== Tam giác ==");
		System.out.println(triangle);
		triangle.displayInfo();
	}

}

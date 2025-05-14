package CV;

public abstract class Shape {
	public abstract double area();
	public abstract double perimeter();

	public void displayInfo() {
		System.out.println("Diện tích: " + area());
		System.out.println("Chu vi: " + perimeter());
	}
}

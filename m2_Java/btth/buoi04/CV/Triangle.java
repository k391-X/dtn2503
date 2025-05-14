package CV;

public class Triangle extends Shape {
	private double a, b, c;
	
	public Triangle(double a, double b, double c) {
		if (a + b <= c || a + c <= b || b + c < a) {
			throw new IllegalArgumentException("Ba cạnh không tạo thành tam giác.");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double area() {
		double p = perimeter() / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public double perimeter() {
		return a + b +c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}

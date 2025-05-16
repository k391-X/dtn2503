package Bai06_Mo_rong_Factory;

public class Main {

	public static void main(String[] args) {
		// Dang ki dong
		ProductFactory.register("book", Book::new);
		ProductFactory.register("phone", Phone::new);

		// Tao san pham
		Product p1 = ProductFactory.create("book");
		p1.use();
		
		Product p2 = ProductFactory.create("phone");
		p2.use();
		
		// Product p3 = ProductFactory.create("laptop"); 	
	}

}

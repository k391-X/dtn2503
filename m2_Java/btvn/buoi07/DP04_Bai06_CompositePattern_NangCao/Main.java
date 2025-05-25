package DP04_Bai04_CompositePattern_NangCao;

public class Main {

	public static void main(String[] args) {
		// Tao menu chinh
		SubMenu mainMenu = new SubMenu("Main Menu");
		
		// Tao muc don
		MenuItem home = new MenuItem("Home");
		MenuItem about = new MenuItem("About");
		
		// Tao submenu cap 1
		SubMenu products = new SubMenu("Products");
		products.add(new MenuItem("Laptop"));
		products.add(new MenuItem("Phone"));

		// Submenu long tiep
		SubMenu services = new SubMenu("Services");
		SubMenu webDev = new SubMenu("Web Development");
		webDev.add(new MenuItem("Frontend"));
		webDev.add(new MenuItem("Backend"));
		services.add(webDev);
		services.add(new MenuItem("SEO"));
		
		// Them vao menu chinh
		mainMenu.add(home);
		mainMenu.add(about);
		mainMenu.add(products);
		mainMenu.add(services);
		
		// Hien thi toan bo menu
		mainMenu.show("");
	}

}

package Bai07_AbstractFactory_co_ban;

public class Main {

	public static void main(String[] args) {
		GUIFactory factory;

		// lay tu config, he dieu hanh
		String os = "Windows";

		if (os.equalsIgnoreCase("Windows")) {
			factory = new WindowsFactory();
		} else if (os.contentEquals("Mac")) {
			factory = new MacFactory();
		} else {
			throw new IllegalArgumentException("Unsupported OS: " + os);
		}
		
		Application app = new Application(factory);
		app.renderUI();

	}

}

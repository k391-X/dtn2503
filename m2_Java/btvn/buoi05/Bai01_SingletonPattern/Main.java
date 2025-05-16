package Bai01_SingletonPattern;

public class Main {

	public static void main(String[] args) {
		// Lay instance dau tien
		AppConfig config1 = AppConfig.getInstace();
		System.out.println("App Name: " + config1.getAppName());
		System.out.println("Version: " + config1.getVersion());

		// Thay doi cau hinh
		config1.setAppName("Super App");
		config1.setVersion("2.0.0");

		// Lay instance so hai
		AppConfig config2 = AppConfig.getInstace();
		System.out.println("App Name: " + config2.getAppName());
		System.out.println("Version: " + config2.getVersion());

		// Kiem tra xem ca 2 co cung la 1 instance
		System.out.println("Cung instance: " + (config1 == config2));
	}

}

package Bai01_SingletonPattern;

public class AppConfig {
	
	// Bien static de luu instance duy nhat	
	private static AppConfig instance;
	
	private String appName;
	private String version;
	
	// Constructor private de khong the tao instance tu ben ngoai
	private AppConfig() {
		this.appName = "My Awesome App";
		this.version = "1.0.0";
	}
	
	// Phương thức getInstance() để truy cập instance duy nhất
	public static AppConfig getInstace() {
		if (instance == null) {
			instance = new AppConfig(); // Tao moi neu chua co
		}
		return instance;
	}

	public static AppConfig getInstance() {
		return instance;
	}

	public static void setInstance(AppConfig instance) {
		AppConfig.instance = instance;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "AppConfig [appName=" + appName + ", version=" + version + "]";
	}
	
}

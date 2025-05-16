package Bai02_Thread_safe_singleton;

public class Logger {
	// Private constructor de khong ai co the tao moi
	private Logger() {
	}

	// Lop tinh ben trong chua instance duy nhat
	private static class LoggerHolder {
		private static final Logger INSTANCE = new Logger();
	}

	// Truy cap instance duy nhat
	public static Logger getInstance() {
		return LoggerHolder.INSTANCE;
	}

	// Phuong thuc log
	public void log(String message) {
		System.out.println("[LOG] " + message);
	}

}

package Bai02_Thread_safe_singleton;

public class Main {

	public static void main(String[] args) {
		// Tao 2 thread cung goi Logger
		Runnable task = () -> {
			Logger logger = Logger.getInstance();
			logger.log("Logging from thread: " + Thread.currentThread().getName());
		};
		
		Thread t1 = new Thread(task, "T1");
		Thread t2 = new Thread(task, "T2");
		
		t1.start();
		t2.start();

	}

}

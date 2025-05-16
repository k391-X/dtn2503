package Bai05_Factory_co_tham_so;

public class EmailNotification implements Notification {

	@Override
	public void send() {
		System.out.println("Sending an Email notification.");
		
	}
	
}

package Bai05_Factory_co_tham_so;

public class SMSNotification implements Notification {

	@Override
	public void send() {
		System.out.println("Sending an SMS notification.");
		
	}
	
}

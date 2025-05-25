package DP04_Bai06_DecoratorPattern_NangCao;

public class SimpleEmailSender implements EmailService {

	@Override
	public void send(String message) {
		System.out.println("📧 Sending email with content: " + message);
	}

}

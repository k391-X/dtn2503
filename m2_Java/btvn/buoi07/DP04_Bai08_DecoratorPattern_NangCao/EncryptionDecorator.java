package DP04_Bai06_DecoratorPattern_NangCao;

public class EncryptionDecorator extends EmailDecorator {

	public EncryptionDecorator(EmailService service) {
		super(service);
	}

	@Override
	public void send(String message) {
		String encrypted = "[Encrypted] " + message;
		super.send(encrypted);
	}
}

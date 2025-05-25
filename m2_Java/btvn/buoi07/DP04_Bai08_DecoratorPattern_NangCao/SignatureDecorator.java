package DP04_Bai06_DecoratorPattern_NangCao;

public class SignatureDecorator extends EmailDecorator {

	public SignatureDecorator(EmailService service) {
		super(service);
	}

	@Override
	public void send(String message) {
		String signed = message + " [Signed by: System]";
		super.send(signed);
	}

}

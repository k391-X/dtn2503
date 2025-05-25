package DP04_Bai06_DecoratorPattern_NangCao;

public class CompressionDecorator extends EmailDecorator {

	public CompressionDecorator(EmailService service) {
		super(service);
	}

	@Override
	public void send(String message) {
		String compressed = "[Compressed] " + message;
		super.send(compressed);
	}

}

package DP04_Bai06_DecoratorPattern_NangCao;

public abstract class EmailDecorator implements EmailService {
	protected EmailService wrapped;
	
	public EmailDecorator(EmailService service) {
		this.wrapped = service;
	}
	
	@Override
	public void send(String message) {
		wrapped.send(message);
	}
}

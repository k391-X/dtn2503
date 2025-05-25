package DP04_Bai02_AdapterPattern_NangCao;

public class PaypalAdapter implements PaymentGateway {

	private PaypalAPI paypal = new PaypalAPI();
	
	@Override
	public void pay(double amount) {
		paypal.sendPayment(amount);
	}
	
}

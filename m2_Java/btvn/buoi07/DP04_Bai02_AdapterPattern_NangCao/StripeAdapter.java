package DP04_Bai02_AdapterPattern_NangCao;

public class StripeAdapter implements PaymentGateway {

	private StripeAPI stripe = new StripeAPI();
	
	@Override
	public void pay(double amount) {
		stripe.makeCharge(amount);
	}
	
}

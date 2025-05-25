package DP04_Bai02_AdapterPattern_NangCao;

public class Main {

	public static void main(String[] args) {
		PaymentGateway paypal = new PaypalAdapter();
		PaymentGateway stripe = new StripeAdapter();
		PaymentGateway crypto = new CryptoAdapter();
		
		paypal.pay(100.0);
		stripe.pay(200.0);
		crypto.pay(300.0);
	}

}

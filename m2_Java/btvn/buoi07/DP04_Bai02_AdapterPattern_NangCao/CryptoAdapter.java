package DP04_Bai02_AdapterPattern_NangCao;

public class CryptoAdapter implements PaymentGateway {

	private CryptoAPI crypto = new CryptoAPI();
	
	@Override
	public void pay(double amount) {
		crypto.transferCrypto(amount);
	}
	
}

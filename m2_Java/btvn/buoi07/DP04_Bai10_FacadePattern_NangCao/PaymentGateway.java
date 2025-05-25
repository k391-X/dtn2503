package DP04_Bai10_FacadePattern_NangCao;

public class PaymentGateway {
	public boolean processPayment(String account, double amount) {
		System.out.println("Thanh toán " + amount + " từ tài khoản" + account);
		return true;
	}
}

package DP04_Bai10_FacadePattern_NangCao;

public class Main {

	public static void main(String[] args) {
		OrderService orderService = new OrderService();
		
		orderService.placeOrder(
				"SP001", 
				"user123", 
				499000, 
				"123 Đường ABC, TP.HCM", 
				"khachhang@gmail.com"
		);
	}

}

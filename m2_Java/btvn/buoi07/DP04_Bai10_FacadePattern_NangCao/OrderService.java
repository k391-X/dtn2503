package DP04_Bai10_FacadePattern_NangCao;

public class OrderService {
	private Inventory inventory = new Inventory();
	private PaymentGateway payment = new PaymentGateway();
	private Shipping shipping = new Shipping();
	private Notification notification = new Notification();
	
	public void placeOrder(String itemId, String account, double amount, String address, String email) {
		System.out.println("🔔 Bắt đầu xử lý đơn hàng...");
		
		if (!inventory.checkStock(itemId)) {
			System.out.println("❌ Sản phẩm hết hàng.");
			return;
		}
		
		if (!payment.processPayment(account, amount)) {
			System.out.println("❌ Thanh toán thất bại.");
			return;
		}
		
		inventory.reduceStock(itemId);
		shipping.shipItem(itemId, address);
		notification.sendEmail(email, "Đơn hàng của bạn đang được giao!");
		
		System.out.println("✅ Đặt hàng thành công!");
	}
}

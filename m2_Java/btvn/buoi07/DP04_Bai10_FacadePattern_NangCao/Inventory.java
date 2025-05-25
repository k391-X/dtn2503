package DP04_Bai10_FacadePattern_NangCao;

public class Inventory {
	public boolean checkStock(String itemId) {
		System.out.println("Kiểm tra tồn kho cho sản phẩm: " + itemId);
		return true;
	}

	public void reduceStock(String itemId) {
		System.out.println("Đã trừ hàng trong kho: " + itemId);
	}
}

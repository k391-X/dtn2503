package QLSP;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	private ArrayList<Product> products = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		int choice;
		do {
            System.out.println("\n=== MENU QUẢN LÝ SẢN PHẨM ===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm sản phẩm");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
            case 1 -> addProduct();
            case 2 -> updateProduct();
            case 3 -> deleteProduct();
            case 4 -> searchProduct();
            case 5 -> showAll();
            case 0 -> System.out.println("Đã thoát.");
            default -> System.out.println("Lựa chọn không hợp lệ!");
            }
		} while (choice != 0);
	}
	
	
	private void addProduct() {
		System.out.println("Nhập mã: ");
		String id = scanner.nextLine();
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập giá: ");
		double price = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập số lượng: ");
		int quantity = Integer.parseInt(scanner.nextLine());
		
		products.add(new Product(id, name, price, quantity));
		System.out.println("✅ Đã thêm sản phẩm.");
	}
	
	private void updateProduct() {
		System.out.println("Nhập mã sản phẩm cần sửa: ");
		String id = scanner.nextLine();
		Product p = findById(id);
		
		if (p != null) {
			System.out.println("Tên mới: ");
			p.setName(scanner.nextLine());
			System.out.println("Giá mới: ");
			p.setPrice(Double.parseDouble(scanner.nextLine()));
			System.out.println("Số lượng mới: ");
			p.setQuantity(Integer.parseInt(scanner.nextLine()));
			System.out.println("✅ Đã cập nhật.");
		} else {
			System.out.println("❌ Không tìm thấy sản phẩm.");
		}
	}
	
	private void deleteProduct() {
		System.out.println("Nhập mã sản phẩm cần xoá: ");
		String id = scanner.nextLine();
		Product p = findById(id);
		if (p != null) {
			products.remove(p);
			System.out.println("✅ Đã xóa sản phẩm.");
		} else {
			System.out.println("❌ Không tìm thấy sản phẩm.");
		}
	}
	
	private void searchProduct() {
		System.out.println("Nhập mã sản phẩm cần tìm: ");
		String id = scanner.nextLine();
		Product p = findById(id);
		if (p != null) {
			System.out.println(p);
		} else {
			System.out.println("❌ Không tìm thấy sản phẩm.");
		}
	}
	
	private void showAll() {
		if (products.isEmpty()) {
			System.out.println("⚠️ Danh sách rỗng.");
		} else {
			System.out.println("=== DANH SÁCH SẢN PHẨM ===");
			for (Product p : products) {
				System.out.println(p);
			}
		}
	}
	
	private Product findById(String id) {
		for (Product p : products) {
			if (p.getId().equalsIgnoreCase(id)) {
				return p;
			}
		}
		
		return null;
	}
}

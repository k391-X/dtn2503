package QLTVS;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("✅ Đã thêm sách: " + b.getTitle());
    }

    public void searchByTitle(String keyword) {
        System.out.println("\n🔍 Kết quả tìm theo tên sách chứa \"" + keyword + "\":");
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Không tìm thấy sách nào.");
    }

    public void searchByAuthor(String keyword) {
        System.out.println("\n🔍 Kết quả tìm theo tác giả chứa \"" + keyword + "\":");
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Không tìm thấy sách nào.");
    }

    public void showAllBooks() {
        System.out.println("\n📖 Danh sách tất cả sách trong thư viện:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

package QLTVS;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();

        // Thêm sách tự động
        library.addBook(new Book("B001", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 1941));
        library.addBook(new Book("B002", "Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "Nguyễn Nhật Ánh", 2010));
        library.addBook(new Book("B003", "Harry Potter", "J.K. Rowling", 1997));
        library.addBook(new Book("B004", "Chuyện Con Mèo Dạy Hải Âu Bay", "Luis Sepúlveda", 1996));

        // In toàn bộ sách
        library.showAllBooks();

        // Tìm theo tên sách
        library.searchByTitle("hoa vàng");

        // Tìm theo tác giả
        library.searchByAuthor("Tô Hoài");

	}

}

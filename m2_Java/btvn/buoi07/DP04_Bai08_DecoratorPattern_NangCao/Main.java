package DP04_Bai06_DecoratorPattern_NangCao;

public class Main {

	public static void main(String[] args) {
		EmailService email = new SimpleEmailSender();
		email = new EncryptionDecorator(email);
		email = new SignatureDecorator(email);

		email.send("Nội dung bí mật");

		// Gửi email nén + mã hoá
		EmailService email2 = new CompressionDecorator(new EncryptionDecorator(new SimpleEmailSender()));
		email2.send("Báo cáo doanh thu tháng 5");
	}

}

package ATM;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789", "Nguyen Van A", 1000000);

		System.out.println("➡️ 1. Kiểm tra số dư ban đầu:");
		account.checkBalance();
		
		System.out.println("\n➡️ 2. Nạp 500,000:");
		account.deposit(500000);
		
		System.out.println("\n➡️ 3. Rút 200,000:");
		account.withdraw(200000);
		
        System.out.println("\n➡️ 4. Kiểm tra số dư sau các giao dịch:");
        account.checkBalance();

        System.out.println("\n✅ Thoát chương trình.");
	}

}

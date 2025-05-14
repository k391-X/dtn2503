package ATM;

public class BankAccount {
	private String accountNumber;
	private String ownerName;
	private double balance;

	public BankAccount(String accountNumber, String ownerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Số tiền nạp phải lớn hơn 0.");
			return;
		}
		balance += amount;
		System.out.println("Nạp tiền thành công. Số dư mới: " + balance);
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Số tiền rút phải lớn hơn 0.");
		} else if (amount > balance) {
			System.out.println("Rút không thành công. Số dư không đủ.");
		} else {
			balance -= amount;
			System.out.println("Rút tiền thành công. Số dư còn lại: ");
		}
	}

	public void checkBalance() {
		System.out.println("Chủ tài khoản: " + ownerName);
		System.out.println("Số tài khoản: " + accountNumber);
		System.out.println("Số dư hiện tại: " + balance);
	}
}

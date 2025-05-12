package HTNH;

public class CheckingAccount extends BankAccount {
	private double withdrawLimit;
	
	public CheckingAccount(String accountNumber, String ownerName, double balance, double withdrawLimit) {
		super(accountNumber, ownerName, balance);
		this.withdrawLimit = withdrawLimit;
	}

	public void withdraw(double amount) {
		double balance = getBalance();
		if (amount <= withdrawLimit && amount <= balance) {
			balance -= amount;
			setBalance(balance);
			log("Rút: -"+amount+", Số dư: "+balance);
		} else {
			log("Rút thất bại: Vượt hạn mức hoặc không đủ tiền!");
		}
	}
	
	public void calculateInterest() {
		log("Tài khoản Checking không có lãi.");
	}
	
	
}

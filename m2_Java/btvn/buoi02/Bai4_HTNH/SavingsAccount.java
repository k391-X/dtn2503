package HTNH;

public class SavingsAccount extends BankAccount {
	private static final double INTEREST_RATE = 0.05;

	public SavingsAccount(String accountNumber, String ownerName, double balance) {
		super(accountNumber, ownerName, balance);
	}

	@Override
	public void calculateInterest() {
		double balance = getBalance();
		double interest = balance + INTEREST_RATE;
		balance += interest;
		setBalance(balance);
		log(String.format("Lãi suất: +%.2f, Số dư: %.2f", interest, getBalance()));
	}

}

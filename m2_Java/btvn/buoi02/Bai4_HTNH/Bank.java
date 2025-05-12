package HTNH;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<String, BankAccount> accounts = new HashMap<>();
	
	public void addAccount(BankAccount account) {
		accounts.put(account.getAccountNumber(), account);
		System.out.println("Thêm tài khoản: " + account.getAccountNumber());
	}
	
	public void deposit(String accNumber, double amount) {
		BankAccount acc = accounts.get(accNumber);
		if (acc != null) acc.deposit(amount);
		else System.out.println("Không tìm thấy tài khoản!");
	}
	
	public void withdraw(String accNumber, double amount) {
		BankAccount acc = accounts.get(accNumber);
		if (acc != null) acc.withdraw(amount);
		else System.out.println("Không tìm thấy tài khoản!");
	}
	
	public void calculateALlInterest() {
		for (BankAccount acc: accounts.values()) {
			acc.calculateInterest();
		}
	}
	
	public double getTotalBalance() {
		double total = 0;
		for (BankAccount acc: accounts.values()) {
			total += acc.getBalance();
		}
		return total;
	}
}

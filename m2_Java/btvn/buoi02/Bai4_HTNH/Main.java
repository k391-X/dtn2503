package HTNH;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.addAccount(new SavingsAccount("SA001", "Nguyen Van A", 10000000));
		bank.addAccount(new CheckingAccount("CA001", "Le Thi B", 5000000, 2000000));

		bank.deposit("SA001", 2000000);
		bank.withdraw("CA001", 1000000);
		bank.withdraw("CA001", 3000000);

		bank.calculateALlInterest();
		System.out.println(String.format("Tổng tiền toàn hệ thống: %.2f", bank.getTotalBalance()));
	}

}

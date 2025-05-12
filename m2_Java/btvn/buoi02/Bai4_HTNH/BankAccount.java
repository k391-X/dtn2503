package HTNH;

public abstract class BankAccount implements Loggable {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        log(String.format("Nhận: +%.2f, Số dư: %.2f", amount, getBalance()));
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            log(String.format("Rút: -%.2f, Số dư: %.2f", amount, getBalance()));
        } else {
            log("Rút thất bại: Không đủ tiền!");
        }
    }

    public abstract void calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void log(String message) {
        System.out.println("[" + accountNumber + "] " + message);
    }
}

package assignment_oct04_part2;

public abstract class BankAccount {
	
	int accountNumber;
	String accountHolder;
	double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount);

	public String displayAccountInfo() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}
}

package assignment_oct04_part2;

public class SavingsAccount extends BankAccount implements TransactionFee {

	double annualInterestRate;
	
	public SavingsAccount(int accountNumber, String accountHolder, double balance, double annualInterestRate) {
		super(accountNumber, accountHolder, balance);
		this.annualInterestRate = annualInterestRate;
	}
	
	public void addInterest(double balance, double anInt, int years) {
		double y = 0;
		balance = balance + (1 + (anInt / y)) * y - 1;
	}
	
	@Override
	public String displayAccountInfo() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}

	@Override
	public void applyTransactionFee(double fee) {
		this.annualInterestRate = fee;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance = balance - amount;
	}

}

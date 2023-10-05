package assignment_oct04_part2;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount b1 = new SavingsAccount(3744, "Erica Diogo", 500, 0.5);
		System.out.print(b1.addInterest(b1.balance, b1.annualInterestRate, 5));
		
	}

}

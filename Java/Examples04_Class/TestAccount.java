package q01.quiz04;

public class TestAccount {

	public static void main(String[] args) {
		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(4.5);
		
		ac.withdraw(2500);
		ac.deposit(3000);
		
		System.out.println("balance: " + ac.getBalance() + ", monthly interest rate: " + ac.getMonthlyInterestRate());

	}
}

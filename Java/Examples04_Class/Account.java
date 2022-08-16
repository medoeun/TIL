package q01.quiz04;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;

	public Account() {
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	public double getMonthlyInterest() {
		return this.balance * (1 + getMonthlyInterestRate());
	}

	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}

	public void withdraw(double money) {
		this.balance -= money;
	}

	public void deposit(double money) {
		this.balance += money;
	}

}

package q01.quiz04.quiz08;

public class Account {
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;

	private int id = 0;
	private int balance = 0;

	public Account() {
	}

	public Account(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}

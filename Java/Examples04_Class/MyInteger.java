package q01.quiz04;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		return !isEven();
	}

	public boolean equals(int number) {
		if (value == number) {
			return true;
		} else {
			return false;
		}
	}

}

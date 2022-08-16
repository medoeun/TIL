package q01.quiz04;

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger int1 = new MyInteger(7);
		MyInteger int2 = new MyInteger(26);

		System.out.println("첫번째 숫자");
		System.out.println(int1.getValue());
		System.out.println(int1.isEven());
		System.out.println(int1.isOdd());
		System.out.println(int1.equals(7));

		System.out.println();
		
		System.out.println("두번째 숫자");
		System.out.println(int2.getValue());
		System.out.println(int2.isEven());
		System.out.println(int2.isOdd());
		System.out.println(int2.equals(7));
	}

}

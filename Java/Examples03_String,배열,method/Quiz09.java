package q01.quiz03;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
//		문제 9. 숫자의 각 자리의 수(digit) 더하기
//		Console에서 정수를 입력 받아 입력된 정수 숫자의 각 digit를 더한 값을 구하는 메소드 만들기

		System.out.println("정수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		long num = input.nextLong();
		
		System.out.println(sumDigits(num));
	}

	public static int sumDigits(long n) {
		
		int sum = 0;
		while(n>0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}

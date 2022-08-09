package q01.quiz03;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
//		문제 10. 입력된 숫자를 역순으로 만들기
//		Console에서 정수를 입력 받아 입력된 정수값이 역순으로 된 정수를 구하는 메소드 만들기

		System.out.println("정수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		reverse(num);
	}

	public static void reverse(int number) {
		int length = Integer.toString(number).length();
		int[] arr = new int[length];
		int i = 0;
		while (i < length) {
			arr[i] = number % 10;
			number /= 10;
			i++;
		}
		
		for(int n:arr) {
			System.out.print(n);
		}
	}
}

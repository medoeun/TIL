package q01.quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// 문제 5. 2개 정수로부터 연산
		// 2개의 정수를 키보드로 부터 읽어, 덧셈, 빼기, 곱하기, 평균, 최대값, 최소값을 구해 출력

		System.out.println("두 개의 정수를 입력하세요.");
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println("덧셈: " + (a + b));
		System.out.println("뺄셈: " + (a - b));
		System.out.println("곱셈: " + (a * b));
		System.out.println("평균: " + ((a + b) / 2));
		
		if (a >= b) {
			System.out.println("최대값: " + a);
		} else {
			System.out.println("최대값: " + b);
		}

		if (a >= b) {
			System.out.println("최소값: " + b);
		} else {
			System.out.println("최소값: " + a);
		}

	}
}

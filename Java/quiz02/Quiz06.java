package q01.quiz02;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// while문을 이용하여 입력된 정수들에 대하여,
		// 입력한 양수의 전체 개수, 음수의 전체 개수, 전체 평균값을 구하여 출력

		Scanner sc = new Scanner(System.in);
		int plusCount = 0;
		int minusCount = 0;
		double average = 0;
		int sum = 0;

		System.out.println("아무 수들을 입력받아 양수의 개수, 음수의 개수, 전체 합, 전체 평균값을 출력합니다.");
		while (true) {
			int userInput = sc.nextInt();
			sum += userInput;
			if (userInput > 0) {
				plusCount++;
			} else if (userInput < 0) {
				minusCount++;
			} else if (userInput == 0) {
				break;
			}
		}
		average = (double)sum / (plusCount + minusCount);
		System.out.println("양수의 개수: " + plusCount + ", 음수의 개수: " + minusCount + ", 전체 합: " + sum + ", 평균 값: " + average);

	}
}

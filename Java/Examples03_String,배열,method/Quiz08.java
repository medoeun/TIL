package q01.quiz03;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
//		문제 8. 내림차순 메소드 구하기
//		Console에서 3개의 정수를 읽어 내림차순으로 정렬하여 출력하는 메소드 만들기

		System.out.println("3개의 정수를 입력하시오.");
		Scanner input = new Scanner(System.in);
		double num1 = input.nextInt();
		double num2 = input.nextInt();
		double num3 = input.nextInt();
		displaySortedNumbers(num1, num2, num3);

	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double[] numArr = { num1, num2, num3 };

		double tmp = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] < numArr[j]) {
					tmp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = tmp;
				}
			}
		}
		System.out.println((int)numArr[0]+" "+(int)numArr[1]+" "+(int)numArr[2]);
	}
}

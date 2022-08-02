package q01.quiz02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 3개의 정수값을 키보드로 부터 읽어, 오름차순으로 정렬하여 결과를 출력
		System.out.println("3개의 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 <= num2 && num2 <= num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if (num1 <= num3 && num3 <= num2) {
			System.out.println(num1 +" "+ num3 +" "+ num2);
		} else if (num3 <= num2 && num2 <= num1) {
			System.out.println(num3 +" "+ num2 +" "+ num1);
		} else if (num3 <= num1 && num1 <= num2) {
			System.out.println(num3 +" "+ num1 +" "+ num2);
		} else if (num2 <= num1 && num1 <= num3) {
			System.out.println(num2 +" "+ num1 +" "+ num3);
		} else {
			System.out.println(num2 +" "+ num3 +" "+ num1);
		}
	}
}

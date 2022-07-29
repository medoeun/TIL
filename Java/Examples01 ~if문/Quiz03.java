package q01.quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 문제 3. 6개월 후의 적금 총액 구하기
		// 매월 적금 금액과 1년 이자율을 키보드에서 읽어, 6개월 후의 이자와 원금을 합한 총 금액 출력

		Scanner input = new Scanner(System.in);

		System.out.println("매월 적금 금액(원): ");
		double savingsMoney = input.nextInt();
		System.out.print("1년 이자율(%): ");
		double rateOfInterest = input.nextInt();

		rateOfInterest = ((rateOfInterest / 12) * 0.01);
		double totalMount = 0;

		for (int i = 0; i < 6; ++i) {
			totalMount = (savingsMoney + totalMount) * (1 + rateOfInterest);
		}

		System.out.println("6개월 후의 총 금액은 " + totalMount + "원 입니다.");
	}
}

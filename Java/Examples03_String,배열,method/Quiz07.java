package q01.quiz03;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
//		문제 7. 적금 총액 계산 메소드
//		매월 적금 금액, 월 이자율, 적금 기간을 이용하는 적금을 계산하는 메소드 만들기
		System.out.println("매월 적금 금액, 월 이자율, 적금 기간을 입력하시오.");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		int num = input.nextInt();
		System.out.println("총 "+num+"개월이 지난 후 적금액 "
		+calculateSavings(amount, rate, num));
		
	}

	public static double calculateSavings(double amount,
			double monthlyRate, int numOfMonths) {
				
		double totalMount = 0;
		for (int i = 0; i < numOfMonths; ++i) {
			totalMount = (amount + totalMount) * (1 + monthlyRate);
		}	
		return totalMount;
	}
}

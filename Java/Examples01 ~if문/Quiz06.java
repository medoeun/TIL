package q01.quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 문제 6. 2개의 실수값 범위 체크
		// 2개의 double 실수를 키보드로 부터 읽어, 2개의 실수값 모두 0과 1사이에 있는지 check하고 메시지를 출력

		System.out.println("2개의 실수를 입력하세요.");
		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();

		if (((a > 0) && (a < 1)) && ((b > 0) && (b < 1))) {
			System.out.println("두 수가 모두 0과 1 사이에 있습니다.");
		} else {
			System.out.println("두 수 모두가 0과 1 사이에 있지 않습니다.");
		}
	}
}

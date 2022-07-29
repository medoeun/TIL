package q01.quiz01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 문제 1. 정수의 각 자리수의 값 더하기
		// 0과 1000사이의 3자리 정수를 키보드에서 읽어, 정수의 각 자리의 수를 모두 더한 값을 출력 (%, / 사용)

		System.out.println("0에서 1000사이의 3자리 정수를 입력하세요.");

		Scanner input = new Scanner(System.in);

		int intValue = input.nextInt();

		int firstValue = (intValue / 100);
		int secondValue = (intValue / 10) % 10;
		int thirdValue = (intValue % 10);

		int addValue = (firstValue + secondValue + thirdValue);
		
		if (intValue >= 0 && intValue <= 1000) {
			System.out.println(intValue + "의 각 자리 수를 더한 값은 " + addValue +"입니다.");
		} else {
			System.out.println("0과 1000사이의 정수를 입력하세요.");
		}
	}
}

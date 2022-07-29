package q01.quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 문제 4. 4개의 정수값 읽어 비교하기
		// 4개의 정수값을 키보드로 부터 읽어, 4개의 정수값이 모두 같으면 “4개 정수값이 동일합니다”를 출력
		// 아니면 “4개의 정수값이 동일하지 않습니다.”를 출력

		System.out.println("4개의 정수를 입력하세요.");
		Scanner input = new Scanner(System.in);

		int intA, intB, intC, intD;

		intA = input.nextInt();
		intB = input.nextInt();
		intC = input.nextInt();
		intD = input.nextInt();

		if (intA == intB && intB == intC && intC == intD) {
			System.out.println("4개의 정수값이 동일합니다.");
		} else {
			System.out.println("4개의 정수값이 동일하지 않습니다.");
		}
	}
}

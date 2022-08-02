package q01.quiz02;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// Math.random()을 사용하여 0부터 100까지의 숫자 중 1개를 생성한 후,
		// 사용자가 숫자를 추축하여 맞추는 게임을 만드시오 (while, do~while)

		Scanner sc = new Scanner(System.in);

		int num = (int) (Math.random() * 100);
		int userNum;
		do {
			System.out.println("0~100까지 숫자를 추측해 보세요");
			userNum = sc.nextInt();
			if (num > userNum) {
				System.out.println("당신이 추측한 숫자의 값이 낮습니다.");
			} else if (num < userNum) {
				System.out.println("당신이 추측한 숫자의 값이 높습니다.");
			} else if (num == userNum) {
				System.out.println(num + "! " + "숫자를 정확히 맞추었습니다.");
				break;
			}
		} while (num != userNum);
	}
}

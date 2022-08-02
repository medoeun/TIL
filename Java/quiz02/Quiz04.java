package q01.quiz02;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// Math.random()으로 0, 1, 2값을 갖는 3개의 정수를 random하게 생성한 후
		// console에서 사용자가 0, 1, 2 중 하나를 입력받아 승리 결과를 출력

		int num = (int) (Math.random() * 2);

		System.out.println("가위(0), 바위(1), 보(2) 중 하나의 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int usernum = sc.nextInt();

		if ((num == 0 && usernum == 1) || (num == 1 && usernum == 2) || (num == 2 && usernum == 0)) {
			System.out.println("당신이 이겼습니다.");
		} else if (num == 0 && usernum == 2 || (num == 1 && usernum == 0) || (num == 2 && usernum == 1)) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}
	}
}

package q01.quiz02;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		// Console에서 전체 학생수와 각 학생별 점수를 입력받아 전체 학생 중 최고점수를 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("전체 학생수를 입력하세요");
		int numStudents = sc.nextInt();
		int max = 0;

		for (int i = 1; i <= numStudents; i++) {
			System.out.print(i + "번 학생의 점수 :");
			int studentScore = sc.nextInt();
			if (studentScore > max) {
				max = studentScore;
			}
		}
		System.out.println("전체 학생의 점수 중 최고 점수는 " + max + "입니다.");
	}
}

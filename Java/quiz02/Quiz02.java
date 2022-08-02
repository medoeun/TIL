package q01.quiz02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// Console에서 사람의 체중, 키를 입력받아 비만도를 체크하여 건강 관련 내용을 출력
		System.out.println("체중과 키를 입력하세요");
		Scanner sc = new Scanner(System.in);

		double weight = sc.nextDouble();
		double height = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println(bmi);
 
		if (bmi >= 30) {
			System.out.println("비만입니다.");
		} else if (bmi >= 25) {
			System.out.println("과체중입니다.");
		} else if (bmi >= 18.5) {
			System.out.println("정상 체중입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
	}
}

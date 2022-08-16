package q01.quiz03;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
//		문제 1. 학생 정보 출력
//		컨솔에서 2문자로 구성된 문자열을 입력받아 학생이 소속된 과이름과 학년을 출력

		System.out.println("소속 과(I : 정보학과, A:회계학과, C:컴퓨터학과)와 학년을 차례로 입력하세요. 예) I1 : 정보학과 1학년");
		Scanner input = new Scanner(System.in);
		String str = input.next();

		char arr[] = str.toCharArray();

		if (arr[0] == 'I') {
			System.out.println("정보학과 " + arr[1] + "학년 입니다.");
		} else if (arr[0] == 'A') {
			System.out.println("회계학과 " + arr[1] + "학년 입니다.");
		} else if (arr[0] == 'C') {
			System.out.println("컴퓨터학과 " + arr[1] + "학년 입니다.");
		}

	}
}

package q01.quiz03;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
//		문제 6. Password 체크
//		password를 check하는 메소드를 만들고 password 문자열을 입력하여 유효한지 결과 출력
		System.out.println("password를 입력하시오.");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		pwCheck(password);
	}

	public static void pwCheck(String s) {

		int numcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numcount++;
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i)) && s.length() >= 10 && numcount >= 3) {
				System.out.println("password 문자열 " + s + "은 유효합니다");
			} else {
				System.out.println("password 문자열 " + s + "은 유효하지 않습니다");
				break;
			}
		}
	}
}

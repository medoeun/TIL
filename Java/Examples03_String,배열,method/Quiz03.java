package q01.quiz03;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
//		문제 3. 문자열 간에 포함관계 여부 확인
//		2개의 문자열을 읽어 2번째 문자열이 첫번째 문자열의 substring인지 여부를 출력
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 문자열을 입력하시오.");
		String st1 = input.nextLine();
		
		System.out.println("두번째 문자열을 입력하시오.");
		String st2 = input.nextLine();
		
		if (st1.contains(st2)) {
			System.out.println(st2+"는 "+st1+"의 substring입니다.");
		} else {
			System.out.println(st2+"는 "+st1+"의 substring이 아닙니다.");
		}
	}
}

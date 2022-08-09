package q01.quiz03;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
//		문제 5. 문자열의 영문자 숫자 알아 맞추기
//		문자열에서 영문자의 숫자를 세는 메소드를 만들고 사용 결과를 출력

		System.out.println("영문자를 포함하여 이루어진 문자열을 입력하세요.");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("전체 문자 개수는 "+ countLetters(str) +"입니다.");		
		
	}
	
	public static int countLetters(String s) {
		char arr[] = s.toCharArray();

		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(Character.isLetter(arr[i])==true) {
				count++;
			}
		}
		return count;
	}
}

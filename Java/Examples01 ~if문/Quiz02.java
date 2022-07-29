package q01.quiz01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 문제 2. 년과 일 수 구하기
		// 분단위 숫자를 키보드에서 읽어, 일의 수와 년의 수를 구해 console에 출력하기

		System.out.println("일(日)과 년(年)으로 환산하고 싶은 분(分) 단위를 입력하세요.");
		
		Scanner input = new Scanner(System.in);

		int minute = input.nextInt();

		int minuteToDate = (minute / 1440);
		int dateToYear = (minuteToDate / 365);

		System.out.println(minute + "분은 " + minuteToDate + "일이며, 햇수로 약 " + dateToYear + "년입니다.");

	}

}

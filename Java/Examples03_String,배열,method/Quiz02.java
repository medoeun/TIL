package q01.quiz03;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
//		문제 2. 사원번호가 맞는지 체크하여 체크 결과를 출력

		System.out.println("사원번호를 형식에 맞게 입력하세요.");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char arr[] = str.toCharArray();

		System.out.println("확인 : " + Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				count++;
			}
		}

		if (arr[3] == '-' && arr[6] == '-' && count == 9) {
			System.out.println(str + "는 사원 번호 형식이 맞습니다");
		} else {
			System.out.println(str + "는 사원 번호 형식이 틀립니다");
		}
	}
}
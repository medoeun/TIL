package q01.quiz03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
//		문제 4. 문자열 정렬
//		3개의 나라이름 문자열을 읽어서 알파벳 내림차순으로 정렬해서 출력

		System.out.println("3개의 나라이름을 입력하시오.");
		Scanner input = new Scanner(System.in);
		String st1 = input.next();
		String st2 = input.next();
		String st3 = input.next();

		String[] strArray = { st1, st2, st3 };

		Arrays.sort(strArray, Comparator.reverseOrder());
		{
//			System.out.println(Arrays.toString(strArray));
			
			System.out.print(strArray[0]+" "+strArray[1]+" "+strArray[2]);
			}
		}
}


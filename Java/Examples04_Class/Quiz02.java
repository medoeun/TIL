package q01.quiz04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		double[][] arr2 = new double[3][4];

		System.out.println("2차원 배열에 넣을 실수값을 입력하세요.");
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr2[i][j] = input.nextDouble();
			}
		}

		//배열 확인
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		double sum=0;
		for (int i =0; i<4; i++) {
			for (int j=0; j<3; j++) {
				sum += arr2[j][i];
			}
			System.out.println((i+1)+"번째 열의 합계는 "+sum+"입니다.");
			sum=0;
		}
	}
}

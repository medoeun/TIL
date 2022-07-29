package q01.quiz01;

public class Quiz07_07 {
	// 연산식의 출력 결과를 ()에 작성
	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5)); // 답: true (1&&1)
		System.out.println((x % 3 == 2) || (y % 2 != 1));	// 답: false (0||0)
	}
}

package q01.quiz01;

public class Quiz07_06 {
	// 사다리꼴 넓이 구하는 코드에서 정확히 소수자릿수가 나오도록 #1 작성
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		// double area = (#1);
		double area = ((double)(lengthTop + lengthBottom) * height / 2);

		System.out.println(area);

	}
}

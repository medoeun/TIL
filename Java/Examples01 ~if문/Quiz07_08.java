package q01.quiz01;

public class Quiz07_08 {
	// % 연산을 수행한 결과값에 10 더하는 코드에서 NaN값을 검사하는 코드 #1에 작성
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;

		double z = x % y;

		/* if (#) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		} */
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}

	}

}

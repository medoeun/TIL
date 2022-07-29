package q01.quiz01;

public class Quiz07_05 {
	// 십의 자리 이하를 버리는 코드에서 변수 value값이 356일 때 300이 나오도록 #1 작성
	// 산술 연산자만 사용
	public static void main(String[] args) {
		int value = 356;
		// System.out.println( #1 );
		System.out.println(value - (value % 100));	//답

	}
}

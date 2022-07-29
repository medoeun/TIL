package q01.quiz01;

public class Quiz07_02 {
	// 다음 코드 실행 시 출력 결과
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(z);
		
		//정답: 11 + 20 = 31 (O)
	}
}

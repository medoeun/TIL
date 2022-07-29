package q01.quiz01;

public class Quiz07_04 {
	// 4,534자루 연필을 30명에게 똑같이 나누어 줄 때 학생당 몇 개를 가지고 최종 몇 개가 남는지 구하는 코드에서
	// #1과 #2에 들어갈 코드를 작성
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		//int pencilsPerStudent = ( # 1 );
		int pencilsPerStudent = (pencils/students); //답
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		//int pencilsLeft = ( #2 ); //답
		int pencilsLeft = (pencils%students); //답
		System.out.println(pencilsLeft);

	}

}

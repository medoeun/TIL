package q01.quiz02;

public class Quiz01 {

	public static void main(String[] args) {
		// Math.random()를 이용하여 1부터 최대 12 숫자를 생성한 후에 switch문을 사용하여 해당 월을 출력
		
		int month = (int)(Math.random()*12) + 1;
		
		switch (month) {
		case 1:
			System.out.println("1월 입니다");
			break;
		case 2:
			System.out.println("2월 입니다");
			break;
		case 3:
			System.out.println("3월 입니다");
			break;
		case 4:
			System.out.println("4월 입니다");
			break;
		case 5:
			System.out.println("5월 입니다");
			break;
		case 6:
			System.out.println("6월 입니다");
			break;
		case 7:
			System.out.println("7월 입니다");
			break;
		case 8:
			System.out.println("8월 입니다");
			break;
		case 9:
			System.out.println("9월 입니다");
			break;
		case 10:
			System.out.println("10월 입니다");
			break;
		case 11:
			System.out.println("11월 입니다");
			break;
		case 12:
			System.out.println("12월 입니다");
			break;
		}
	} 
}

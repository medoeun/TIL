package q01.quiz02;

public class Quiz09 {

	public static void main(String[] args) {
		// 별찍기 패턴 4가지
		//1
		for (int i=0; i<6; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		//2
		for (int i=0; i<6; i++) {
			for (int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		//3
		for (int i=0; i<7; i++) {
			for (int j=6; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println();
		
		//4
		for (int i=0; i<7; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

package q01.quiz04;

public class TestBMI {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("춘자", 45.5, 1.59);
		BMI bmi2 = new BMI("덕배", 67.5, 1.75);
		
		System.out.println(bmi1.getName()+"의 BMI 수치: "+bmi1.getBMI());
		System.out.println(bmi1.getStatus());
		
		System.out.println();
		
		System.out.println(bmi2.getName()+"의 BMI 수치: "+bmi2.getBMI());
		System.out.println(bmi2.getStatus());

	}
}

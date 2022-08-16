package q01.quiz04;

public class BMI {

	private String name;
	private int age;
	private double weight;
	private double height;

	public BMI(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = 20;
	}

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}

	public double getBMI() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}

	public String getStatus() {
		double bmi = this.getBMI();
		if (bmi < 18.5) {
			return "저체중 입니다.";
		} else if (bmi < 25) {
			return "정상 체중입니다.";
		} else if (bmi<30) {
			return "과체중 입니다.";
		} else {
			return "비만 입니다.";
		}
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
}

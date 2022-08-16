package q01.quiz04;

public class TestFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		
		System.out.print("fan1 ");
		fan1.printFanInformation();
		
		System.out.print("fan2 ");
		fan2.printFanInformation();
		
		System.out.println();
		fan1.setOn();
		fan2.setOn();
		
		System.out.print("fan1 ");
		fan1.printFanInformation();
		
		System.out.print("fan2 ");
		fan2.printFanInformation();
		
	}
}

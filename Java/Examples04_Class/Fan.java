package q01.quiz04;

public class Fan {
	static final int SLOW = 1;
	static final int MEDIUM = 2;
	static final int FAST = 3;

	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn() {
		if(on == true) {
			on = false;
		} else {
			on = true;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void printFanInformation() {
		if (on == true) {
			System.out.println("speed: " + speed);
			System.out.println("radius: " + radius);
			System.out.println("color: " + color);
		} else {
			System.out.println("선풍기가 꺼져 있습니다.");
		}
	}
}

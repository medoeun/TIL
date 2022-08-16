package q01.quiz04;

public class Rectangle {
	public double width = 1;
	public double height = 1;

		
	public double getArea() {
		double result = width * height;
		return result;
	}

	public double getPerimeter() {
		double result = (width + height) * 2;
		return result;
	}
}

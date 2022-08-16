package q01.quiz04;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();

		rect1.height = 4;
		rect1.width = 40;

		System.out.println("인스턴스 정보 출력: width, height, area, perimeter");
		System.out.println();
		System.out.println(
				"rect1: " + rect1.height + ", " + rect1.width + ", " + rect1.getArea() + ", " + rect1.getPerimeter());

		rect2.height = 35.9;
		rect2.width = 3.5;

		System.out.println(
				"rect2: " + rect2.height + ", " + rect2.width + ", " + rect2.getArea() + ", " + rect2.getPerimeter());
	}
}

package threadfool.op.chapter1;

public class SwitchPatternExample {

	sealed interface Shape permits Circle, Rectangle {}

	record Circle(double radius) implements Shape {}
	record Rectangle(double width, double height) implements Shape {}

	static double area(Shape shape) {
		return switch (shape) {
			case Circle(var r) -> Math.PI * r * r;
			case Rectangle(var w, var h) -> w * h;
		};
	}

	public static void main(String[] args) {
		System.out.println(area(new Circle(3)));
		System.out.println(area(new Rectangle(4, 5)));
	}
}

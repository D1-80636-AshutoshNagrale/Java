package Que1;

public class TestBoundedShape {
	public static void main(String[] args) {
		BoundedShape boundedShape = new Circle(5.23);
		BoundedShape boundedShape2 = new Polygon(5);
		BoundedShape boundedShape3 = new Rectangle(45, 5);
		BoundedShape boundedShape4 = new Square(85);

		System.out.println("Area of Circle : " + boundedShape.calcArea());
		System.out.println("Area of Polygon : " + boundedShape2.calcArea());
		System.out.println("Area of Rectangle : " + boundedShape3.calcArea());
		System.out.println("Area of Square : " + boundedShape4.calcArea());
	}
}

package Tester;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D point2d = new Point2D(11, 22);
		point2d.acceptPoint();
		point2d.getDetails();

		Point2D point2d2 = new Point2D(11, 22);
		point2d2.acceptPoint();
		point2d2.getDetails();

		System.out.println(Point2D.validate(point2d, point2d2));
	}
}

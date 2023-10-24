package Tester.copy;

import java.util.Scanner;

import com.app.geometry.copy.Point2D;

public class TestPoint {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of points you want : ");
		int noOfPoints = scanner.nextInt();
		Point2D point2d[] = new Point2D[noOfPoints];
		for (int i = 0; i < point2d.length; i++) {
			point2d[i] = new Point2D();
			point2d[i].acceptPoint();
		}
		System.out.println("=================================================");
		System.out.println("Points accepted successfully");
		System.out.println("=================================================");

		boolean status = true;
		do {
			System.out.println("1. Display details of specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. Display distance between two point");
			System.out.println("4. EXIT");

			System.out.println("Select any one option");
			int key = scanner.nextInt();

			switch (key) {
			case 1:
				System.out.println("Enter point number to display coordinates : ");
				int pointNo = scanner.nextInt();
				point2d[pointNo - 1].getDetails();
				break;
			case 2:
				for (Point2D point2d2 : point2d) {
					point2d2.getDetails();
				}
				break;
			case 3:
				System.out.println("Enter point no.");
				int point1 = scanner.nextInt();
				System.out.println("Enter point no.");
				int point2 = scanner.nextInt();
				String dist = Point2D.validate(point2d[point1 - 1], point2d[point2 - 1]);
				System.out.println(dist);
				break;
			case 4:
				status = false;
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (status == true);

	}
}

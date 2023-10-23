package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		String coordinates = "(" + this.x + "," + this.y + ")";
		System.out.println(coordinates);
		return coordinates;
	}

	public static boolean isEqual(Point2D point2d, Point2D point2d2) {
		if (point2d.x == point2d2.x && point2d.y == point2d2.y) {
			return true;
		} else {
			return false;
		}
	}

	public static String validate(Point2D point2d, Point2D point2d2) {
		if (Point2D.isEqual(point2d, point2d2) == true) {
			return "2 points have same co-ordinates";
		} else {
			int xDiff = point2d.x - point2d2.x;
			int yDiff = point2d.y - point2d2.y;
			return ("2 points are separated by (" + xDiff + "," + yDiff + ")");
		}
	}

	public void acceptPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate of Point : ");
		this.x = sc.nextInt();
		System.out.println("Enter y co-ordinate of Point : ");
		this.y = sc.nextInt();
	}

}

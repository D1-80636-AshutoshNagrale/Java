package Que1;

public abstract class BoundedShape {
	private double x;
	private double y;

	public final double PI = 3.142;

	public BoundedShape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoundedShape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public abstract double calcArea();
}

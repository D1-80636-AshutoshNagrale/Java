package Que1;

public class Rectangle extends BoundedShape {
	private double length;
	private double breadth;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

}

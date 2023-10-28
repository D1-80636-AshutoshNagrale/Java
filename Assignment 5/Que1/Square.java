package Que1;

public class Square extends BoundedShape {
	private double side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}

package Que1;

public class Polygon extends BoundedShape {
	private int noOfSides;

	public Polygon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Polygon(int noOfSides) {
		super();
		this.noOfSides = noOfSides;
	}

	public int getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}

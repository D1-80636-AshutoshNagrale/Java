package Assignment4.Que1.com.app.fruits;

public abstract class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(String colour, double weight, String name, boolean isFresh) {
		super();
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}



	@Override
	public String toString() {
		return "Fruit [colour=" + colour + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	public abstract String taste();

}

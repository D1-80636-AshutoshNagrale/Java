package Assignment4.Que1.com.app.fruits;

public class Mango extends Fruit {

	public Mango(String colour, double weight, String name, boolean isFresh) {
		super(colour, weight, name, isFresh);
	}

	@Override
	public String taste() {
		return "Sweet";
	}

}

package Assignment4.Que1.com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(String colour, double weight, String name, boolean isFresh) {
		super(colour, weight, name, isFresh);
	}

	@Override
	public String taste() {
		return "Sweet n Sour";
	}

}

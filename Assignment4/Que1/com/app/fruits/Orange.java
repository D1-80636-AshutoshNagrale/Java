package Assignment4.Que1.com.app.fruits;

public class Orange extends Fruit {
	
	public Orange(String colour, double weight, String name, boolean isFresh) {
		super(colour,weight,name,isFresh);
	}
	
	@Override
	public String taste() {
		return "Sour";
	}
}

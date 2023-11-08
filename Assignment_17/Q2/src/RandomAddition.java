import java.util.Random;
import java.util.stream.Stream;

public class RandomAddition {

	public static void main(String[] args) {
		Random r = new Random();
		
		int sum = Stream.generate(() -> r.nextInt(100))
						.limit(10)
						.reduce(0, (x, y) -> x + y);
		
		System.out.println("Sum of 10 random integers = " + sum);

	}

}

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int result = Stream.iterate(1, e -> e + 1)
						.limit(num)
						.reduce(1, (x, y) -> x * y);
		
		System.out.println("factorial = " + result);
		
	}

}

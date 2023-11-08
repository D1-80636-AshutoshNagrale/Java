import java.util.stream.IntStream;

public class MainStream {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 10).sum();
		double avg = IntStream.rangeClosed(1, 10).summaryStatistics()
			.getAverage();
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
		
		System.out.println(
				IntStream.rangeClosed(1, 10).summaryStatistics().toString()
		);
		
	}

}

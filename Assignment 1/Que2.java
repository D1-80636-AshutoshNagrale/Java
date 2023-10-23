package Assignment1;

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		System.out.println("Enter any value : ");
		if (sc.hasNextDouble()) {
			num1 = sc.nextDouble();
			System.out.println(num1);
		} else {
			System.out.println("Entered value is not double");
			System.exit(0);
		}
		double num2 = 0;
		System.out.println("Enter any value : ");
		if (sc.hasNextDouble()) {
			num2 = sc.nextDouble();
			System.out.println(num2);
		} else {
			System.out.println("Entered value is not double");
			System.exit(0);
		}
		double avg = (num1 + num2) / 2;
		System.out.println("Average of 2 values is : " + avg);
	}
}

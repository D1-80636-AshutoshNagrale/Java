package Que4;

import java.util.Scanner;

public class Main implements Arithmetic {

	static void calculate(double num1, double num2, Arithmetic op) {

		if (num2 == 0) {
			System.out.println("Cannot divide by 0");
		} else {
			double result = op.calc(num1, num2);
			System.out.println("Result: " + result);
		}
	}

	public static void main(String[] args) {
		int key;
		double d1;
		double d2;
		Scanner sc = new Scanner(System.in);
		boolean bool = true;

		do {
			System.out.printf("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n0. EXIT\nEnter your choice : ");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter number 1 : ");
				d1 = sc.nextDouble();
				System.out.println("Enter number 2 : ");
				d2 = sc.nextDouble();

				calculate(d1, d2, (x, y) -> x + y);
				break;

			case 2:
				System.out.println("Enter number 1 : ");
				d1 = sc.nextDouble();
				System.out.println("Enter number 2 : ");
				d2 = sc.nextDouble();
				calculate(d1, d2, (x, y) -> x - y);
				break;

			case 3:
				System.out.println("Enter number 1 : ");
				d1 = sc.nextDouble();
				System.out.println("Enter number 2 : ");
				d2 = sc.nextDouble();
				calculate(d1, d2, (x, y) -> x * y);
				break;

			case 4:
				System.out.println("Enter number 1 : ");
				d1 = sc.nextDouble();
				System.out.println("Enter number 2 : ");
				d2 = sc.nextDouble();
				calculate(d1, d2, (x, y) -> x / y);
				break;

			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (bool);

	}
}

package Assignment1;

import java.util.Scanner;

public class Que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter any number : ");
		num = sc.nextInt();

		System.out.println("binaryString = " + Integer.toBinaryString(num));
		System.out.println("octalString = " + Integer.toOctalString(num));
		System.out.println("hexaDecimalString = " + Integer.toHexString(num));

	}
}

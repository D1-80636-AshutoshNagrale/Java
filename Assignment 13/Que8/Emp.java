package Que8;

import java.util.Scanner;

public interface Emp {

	public abstract double getSal();

	public default double calcIncentives() {

		return 0.0;
	}

	public static double calcTotalIncome(Emp[] arr) {
		double sal = 0;

		for (Emp emp : arr) {
			sal = sal + emp.getSal() + emp.calcIncentives();
		}
		return sal;
	}

	public abstract void acceptEmployee(Scanner sc);
}

package Que8;

import java.util.Scanner;

public class Clerk implements Emp {

	private double salary;

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clerk [salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public void acceptEmployee(Scanner sc) {
		System.out.println("******** ACCEPT CLERK ********");
		System.out.println("ENTER SALARY : ");
		this.salary = sc.nextDouble();
		System.out.println("****** CLERK ACCEPTED SUCCESSFULLY *****");
	}

}

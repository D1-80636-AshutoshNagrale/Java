package Que5;

import java.util.Scanner;

public class Clerk extends Employee {

	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acceptData(Scanner sc) {
		try {
			System.out.println("Enter Clerk details : ");
			// TODO Auto-generated method stub
			super.acceptData(sc);
		} catch (EmployeeException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getSalary();
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Clerk []";
	}

}

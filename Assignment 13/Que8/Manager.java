package Que8;

import java.util.Scanner;

public class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [basicSalary=");
		builder.append(basicSalary);
		builder.append(", dearanceAllowance=");
		builder.append(dearanceAllowance);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double getSal() {

		return this.basicSalary + this.dearanceAllowance;
	}

	@Override
	public double calcIncentives() {

		return 0.2 * this.basicSalary;
		// return Emp.super.calcIncentives(); ********************** IMP
		// ************************
	}

	@Override
	public void acceptEmployee(Scanner sc) {
		System.out.println("******** ACCEPT MANAGER ********");
		System.out.println("ENTER BASIC SALARY : ");
		this.basicSalary = sc.nextDouble();
		System.out.println("ENTER DEARNESS ALLOWANCE : ");
		this.dearanceAllowance = sc.nextDouble();
		System.out.println("****** MANAGER ACCEPTED SUCCESSFULLY *****");
	}
}

package Que2;

import java.util.Scanner;

public class Labor extends Employee {

	private double rate;
	private int hours;

	public Labor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Labor(double rate, int hours) {
		super();
		this.rate = rate;
		this.hours = hours;
	}

	public Labor(String name, int age, int id, double salary, double rate, int hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public void acceptData(Scanner sc) {
		try {
			System.out.println("Enter Labor details : "); // TODO Auto-generated method stub
			super.acceptData(sc);
			System.out.println("Enter rate : ");
			double rate = sc.nextDouble();
			this.setRate(rate);
			System.out.println("Enter hours : ");
			int hours = sc.nextInt();
			this.setHours(hours);
		} catch (EmployeeException ex) {
			ex.printStackTrace();
		}
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		if (rate <= 0) {
			throw new EmployeeException(String.valueOf(rate));
		} else {
			this.rate = rate;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 && hours <= 24) {
			this.hours = hours;
		} else {
			throw new EmployeeException(String.valueOf(hours));
		}
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Labor [rate=" + rate + ", hours=" + hours + "]";
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return getRate() * getHours();
	}

}

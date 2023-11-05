package Que8;

import java.util.Scanner;

public class Labor implements Emp {

	private int hours;
	private double rate;

	public Labor(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public Labor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Labor [hours=");
		builder.append(hours);
		builder.append(", rate=");
		builder.append(rate);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.hours * this.rate;
	}

	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		if (this.hours > 300) {
			return 0.05 * this.getSal();
		} else {
			return 0;
		}
	}

	@Override
	public void acceptEmployee(Scanner sc) {
		System.out.println("******** ACCEPT LABOR ********");
		System.out.println("ENTER HOURS : ");
		this.hours = sc.nextInt();
		System.out.println("ENTER RATE : ");
		this.rate = sc.nextDouble();
		System.out.println("****** LABOR ACCEPTED SUCCESSFULLY *****");
	}

}

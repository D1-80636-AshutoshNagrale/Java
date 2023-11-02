package com.sunbeam.employee;

import java.util.Scanner;

import com.sunbeam.Employee;
import com.sunbeam.employeeexception.EmployeeException;

public class Labour extends Employee {
	int rate;
	double hours;

	Scanner sc = new Scanner(System.in);

	public Labour() {
	}

	public Labour(int rate, double hours, Scanner sc) {
		this.rate = rate;
		this.hours = hours;
		this.sc = sc;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter rate of the Labour - ");
		rate = sc.nextInt();
		this.setRate(rate);
		System.out.print("Enter Hours worked - ");
		hours = sc.nextDouble();
		this.setHours(hours);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Rate - " + rate);
		System.out.println("Hours - " + hours);
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		if(rate < 0) {
			throw new EmployeeException("Rate cannot be in negative - ", rate);
		}
		else if(rate == 0) {
			throw new EmployeeException("Rate cannot be zero - ", rate);
		}
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if(hours < 0) {
			throw new EmployeeException("Hours cannot be in negative - ", hours);
		}
		else if(hours < 0) {
			throw new EmployeeException("Hours cannot be zero - ", hours);
		}
		this.hours = hours;
	}

	@Override
	public String toString() {
		//return super.toString() + " Labour [rate=" + rate + ", hours=" + hours + "]";
		return super.toString() + String.format("Rate - %d Hours - %f ", this.rate, this.hours);
	}

	@Override
	public double calcSalary() {
		return rate * hours;
	}
}

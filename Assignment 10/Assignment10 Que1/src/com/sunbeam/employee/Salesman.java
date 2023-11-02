package com.sunbeam.employee;

import java.util.Scanner;

import com.sunbeam.Employee;
import com.sunbeam.employeeexception.EmployeeException;

public class Salesman extends Employee {

	int target;
	double commisson;

	Scanner sc = new Scanner(System.in);

	public Salesman() {
	}

	public Salesman(int target, double commisson) {
		this.target = target;
		this.commisson = commisson;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Salesman targer]t - ");
		target = sc.nextInt();
		this.setTarget(target);
		System.out.print("Enter Salesman Commission - ");
		commisson = sc.nextDouble();
		this.setCommisson(commisson);
	}	
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Target - " + target);
		System.out.println("Commission - " + commisson);
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		if(target < 0) {
			throw new EmployeeException("Target cannot be in negative - ", target);
		}
		else if(target == 0) {
			throw new EmployeeException("Target cannot be zero - ", target);
		}
		this.target = target;
	}

	public double getCommisson() {
		return commisson;
	}

	public void setCommisson(double commisson) {
		if(commisson < 0) {
			throw new EmployeeException("Commission cannot be in negative - ", commisson);
		}
		else if(commisson == 0) {
			throw new EmployeeException("Commission cannot be zero - ", commisson);
		}
		this.commisson = commisson;
	}

	@Override
	public String toString() {
//		return super.toString() + " Salesman [target=" + target + ", commisson=" + commisson + "]";
		return super.toString() + String.format("Target - %d Commission - %f ", this.target, this.commisson);
	}

	@Override
	public double calcSalary() {
		return salary + commisson;
	}

}

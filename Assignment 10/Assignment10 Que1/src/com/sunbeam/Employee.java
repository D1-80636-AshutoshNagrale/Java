package com.sunbeam;

import java.util.Scanner;

import com.sunbeam.employeeexception.EmployeeException;

abstract public class Employee extends Person {
	public int id;
	public double salary;

	Scanner sc = new Scanner(System.in);

	public Employee() {
	}

	public Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter Employee id - ");
		id = sc.nextInt();
		this.setId(id);
		System.out.print("Enter Employee Salaray - ");
		salary = sc.nextDouble();
		this.setSalary(salary);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Id - " + id);
		System.out.println("Salary - " + salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id < 0) {
			throw new EmployeeException("ID cannot be in negative - ", id);
		}
		else if (id == 0) {
			throw new EmployeeException("ID cannot be zero - ", id);
		}
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0) {
			throw new EmployeeException("Salary cannot be in negative - ", salary);
		}
		else if (salary == 0) {
			throw new EmployeeException("Salary cannot be zero - ", salary);
		}
		this.salary = salary;
	}

	@Override
	public String toString() {
//		return super.toString() + " Employee [id=" + id + ", salary=" + salary + "]";
		return super.toString() + String.format("id - %d salary - %d ", this.id, this.salary);
	}

	abstract public double calcSalary();
}

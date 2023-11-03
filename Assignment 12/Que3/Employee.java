package Que3;

import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee> {//
	private int id;
	private String name;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter emp id : ");
		this.id = sc.nextInt();
		System.out.println("Enter emp name : ");
		this.name = sc.next();
		System.out.println("Enter emp salary : ");
		this.salary = sc.nextDouble();
		System.out.println("==============================");
		System.out.println("Employee accepted successfully");
		System.out.println("==============================");
	}

	@Override
	public int compareTo(Employee o) {
		int diff = this.id - o.id;
		return diff;
	}
}

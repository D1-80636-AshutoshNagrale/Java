package Que2;

import java.util.Objects;

public abstract class Employee extends Person {
	private int id;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0) {
			throw new EmployeeException(String.valueOf(id));
		} else {
			this.id = id;
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary <= 0) {
			throw new EmployeeException(String.valueOf(salary));
		} else {
			this.salary = salary;
		}
	}

	public abstract double calcSalary();

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, salary);
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
		return id == other.id && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}

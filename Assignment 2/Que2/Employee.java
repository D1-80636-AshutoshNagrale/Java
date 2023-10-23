package Assignment2.Que2;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary < 0) {
			this.monthlySalary = 0;
		}
		this.monthlySalary = monthlySalary;
	}

	void displayEmployee() {
		System.out.println("Name of employee : " + firstName + " " + lastName);
		System.out.println("Yearly salary : " + (monthlySalary * 12));
	}

	public void displayEmployeesAfterRiase() {
		System.out.println("Name of employee : " + firstName + " " + lastName);
		System.out.println("Yearly salary : " + ((monthlySalary * 12)+(monthlySalary*12*0.1)));
	}

}

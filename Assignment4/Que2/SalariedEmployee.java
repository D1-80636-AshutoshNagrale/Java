package Assignment4.Que2;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee() {
		super();

	}

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public SalariedEmployee(double weeklySalary, String fname, String lname, int socialSecurityNumber) {
		super(fname, lname, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public SalariedEmployee(String fname, String lname, int socialSecurityNumber) {
		super(fname, lname, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}

	public double getWeeklySalary() {
		return this.weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}

	@Override
	public void payRoll() {
		System.out.println("payroll of Weekly Employee : " + (12 * (this.weeklySalary + (0.1 * this.weeklySalary))));
	}

}

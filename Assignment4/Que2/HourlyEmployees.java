package Assignment4.Que2;

public class HourlyEmployees extends Employee {
	private double hourlyWage;
	private int hoursWorked;

	public HourlyEmployees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployees(double hourlyWage, int hoursWorked) {
		super();
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public HourlyEmployees(String fname, String lname, int socialSecurityNumber, double hourlyWage, int hoursWorked) {
		super(fname, lname, socialSecurityNumber);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		super.toString();
		return "HourlyEmployees [hourlyWage=" + hourlyWage + ", hoursWorked=" + hoursWorked + "]";
	}

	@Override
	public void payRoll() {
		if (hoursWorked <= 40) {
			System.out.println("pay roll of Hourly Employee : " + (12 * (hourlyWage * hoursWorked)));
		} else if (hoursWorked > 40) {
			System.out.println("pay roll of Hourly Employee : "
					+ (12 * ((40 * hourlyWage) + ((hoursWorked - 40) * hourlyWage * 1.5))));
		}
	}

}

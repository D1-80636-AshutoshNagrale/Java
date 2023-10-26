package Assignment4.Que2;

public class BasePlusCommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	private double baseSalary;

	public BasePlusCommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}

	public BasePlusCommissionEmployee(String fname, String lname, int socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(fname, lname, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void payRoll() {
		System.out.println("pay roll of Base Plus Commission Employees are : "
				+ (12 * ((commissionRate * grossSales) + baseSalary)));
	}

}

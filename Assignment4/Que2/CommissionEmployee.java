package Assignment4.Que2;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommissionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public CommissionEmployee(String fname, String lname, int socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(fname, lname, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		super.toString();
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + "]";
	}

	@Override
	public void payRoll() {
		System.out.println("pay roll of Commission Employees : " + (12 * (commissionRate * grossSales)));
	}

}

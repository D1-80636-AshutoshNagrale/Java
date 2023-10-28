package Que2;

public class Salesman extends Employee {
	private int target;
	private double commission;

	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salesman(int target, double commission) {
		super();
		this.target = target;
		this.commission = commission;
	}

	public Salesman(String name, int age, int id, double salary, int target, double commission) {
		super(name, age, id, salary);
		this.target = target;
		this.commission = commission;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		if (target <= 0) {
			throw new EmployeeException(String.valueOf(target));
		} else {
			this.target = target;
		}
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		if (commission < 0) {
			throw new EmployeeException(String.valueOf(commission));
		}
		this.commission = commission;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Salesman [target=" + target + ", commission=" + commission + "]";
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub

		return getSalary() + getCommission();
	}

}

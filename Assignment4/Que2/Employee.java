package Assignment4.Que2;

public abstract class Employee {
	private String fname;
	private String lname;
	private int socialSecurityNumber;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fname, String lname, int socialSecurityNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	public abstract void payRoll();

}

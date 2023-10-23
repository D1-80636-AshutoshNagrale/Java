package Assignment2.Que2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee("Scott", "Adkins", 150000.00);
		Employee employee2 = new Employee("Roman", "Regins", 160000.00);
		employee.displayEmployee();
		employee2.displayEmployee();
		System.out.println();
		System.out.println("****************************");
		System.out.println("After raise in salary");
		System.out.println("****************************");
		System.out.println();
		employee.displayEmployeesAfterRiase();
		employee2.displayEmployeesAfterRiase();
	}
}

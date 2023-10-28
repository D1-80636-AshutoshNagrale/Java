package Que2;

public class EmployeesTest {

	public static void main(String[] args) {

		Employee[] employees = new Employee[6];

		employees[0] = new Labor("A", 27, 1, 10000, 900, 10);
		employees[1] = new Salesman("B", 30, 2, 30000, 50, 12000);
		employees[2] = new Clerk("C", 40, 3, 20000);

		employees[3] = new Labor("D", 27, 1, 10000, 900, 10);
		employees[4] = new Salesman("E", 30, 2, 30000, 50, 12000);
		employees[5] = new Clerk("F", 40, 3, 20000);

		System.out.println("Average salary of Labor : " + Employees.averageSalLabors(employees));
		System.out.println("Average salary of Clerk : " + Employees.averageSalClerks(employees));
		System.out.println("Average salary of Salesman : " + Employees.averageSalSalesmans(employees));
	}
}

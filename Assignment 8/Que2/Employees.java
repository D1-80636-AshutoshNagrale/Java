package Que2;

public class Employees {

	public static double averageSalLabors(Employee[] arr) {
		double totSalLabor = 0;
		int countLabor = 0;

		for (Employee employee : arr) {
			if (employee instanceof Labor) {
				countLabor++;
				Labor l = (Labor) employee;
				totSalLabor = totSalLabor + l.calcSalary();
			}
		}
		return totSalLabor / countLabor;
	}

	public static double averageSalSalesmans(Employee[] arr) {
		double totSalSalesman = 0;
		int countSalesman = 0;
		for (Employee employee : arr) {

			if (employee instanceof Salesman) {
				countSalesman++;
				Salesman s = (Salesman) employee;
				totSalSalesman = totSalSalesman + s.calcSalary();
			}
		}
		return totSalSalesman / countSalesman;
	}

	public static double averageSalClerks(Employee[] arr) {
		double totSalClerk = 0;
		int countClerk = 0;
		for (Employee employee : arr) {
			if (employee instanceof Clerk) {
				countClerk++;
				Clerk c = (Clerk) employee;
				totSalClerk = totSalClerk + c.calcSalary();
			}
		}
		return totSalClerk / countClerk;
	}
}

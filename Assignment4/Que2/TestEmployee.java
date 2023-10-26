package Assignment4.Que2;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee;
		boolean value = true;
		while (value) {
			System.out.println("0. EXIT");
			System.out.println("1. GET PAYROLL OF SALARIED EMPLOYEES");
			System.out.println("2. GET PAYROLL OF HOURLY EMPLOYEES");
			System.out.println("3. GET PAYROLL OF COMMISSION EMPLOYEES");
			System.out.println("4. GET PAYROLL OF BASE PLUS COMMISSION EMPLOYEES");
			System.out.println("*************************************************");
			System.out.println("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("--------------------");
				System.exit(0);
				break;
			case 1:
				employee = new SalariedEmployee(7000, "Ninad", "Bagde", 12345);
				System.out.println(employee);
				employee.payRoll();
				break;
			case 2:
				employee = new HourlyEmployees("Rahul", "Barmane", 11223, 200, 45);
				System.out.println(employee);
				employee.payRoll();
				break;
			case 3:
				employee = new CommissionEmployee("Ajinkya", "Chole", 87596, 15000, 5.6);
				System.out.println(employee);
				employee.payRoll();
				break;
			case 4:
				employee = new BasePlusCommissionEmployee("Montu", "Birmane", 87456, 20000, 6, 50000);
				System.out.println(employee);
				employee.payRoll();
				break;

			default:
				System.out.println("Wrong choice entered");
				System.exit(0);
				break;
			}
		}
	}
}

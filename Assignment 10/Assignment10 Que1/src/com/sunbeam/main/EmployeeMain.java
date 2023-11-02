package com.sunbeam.main;

import java.util.Scanner;

import com.sunbeam.Employee;
import com.sunbeam.Person;
import com.sunbeam.employee.Clerk;
import com.sunbeam.employee.Labour;
import com.sunbeam.employee.Salesman;
import com.sunbeam.employeeexception.EmployeeException;
import com.sunbeam.generic.Box;
import com.sunbeam.helpermethod.Employees;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int choice;
		int index = -1;
		int in;

		System.out.print("Enter number of total employees - ");
		size = sc.nextInt();

		Employee person[] = new Employee[size];

		do {
			System.out.println("1. Add Labour");
			System.out.println("2. Add Salesman");
			System.out.println("3. Add Clerk");
			System.out.println("4. Display all Labour");
			System.out.println("5. Display all Salesman");
			System.out.println("6. Display all Clerk");
			System.out.println("7. Display average salary of Labour");
			System.out.println("8. Display average salary of Salesman");
			System.out.println("9. Display average salary of Clerk");
			System.out.println("10. Total of all Employee Salary using Generic Class");
			System.out.println();
			System.out.println("Enter option");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				index++;
				if (index < size) {
					person[index] = new Labour();
					try {
						person[index].acceptData();
					} catch (EmployeeException e) {
						System.out.println(e.getField() + e.getInvalidValue());
					}
				} else {
					System.out.println("Employee limit exceed");
				}
				break;
			case 2:
				index++;
				if (index < size) {
					person[index] = new Salesman();
					try {
						person[index].acceptData();
					} catch (EmployeeException e) {
						System.out.println(e.getField() + e.getInvalidValue());
					}
				} else {
					System.out.println("Employee limit exceed");
				}
				break;

			case 3:
				index++;
				if (index < size) {
					person[index] = new Clerk();
					try {
						person[index].acceptData();
					} catch (EmployeeException e) {
						System.out.println(e.getField() + e.getInvalidValue());
					}
				} else {
					System.out.println("Employee limit exceed");
				}
				break;
			case 4:
				for (int i = 0; i <= index; i++) {
					if(person[i] != null)
					if (person[i] instanceof Labour) {
						System.out.println(person[i].toString());
					}
				}
				break;

			case 5:
				for (int i = 0; i < index; i++) {
					if(person[i] != null)
					if (person[i] instanceof Salesman) {
						System.out.println(person[i].toString());
					}
				}
				break;

			case 6:
				for (int i = 0; i < index; i++) {
					if(person[i] != null)
					if (person[i] instanceof Clerk) {
						System.out.println(person[i].toString());
					}
				}
				break;

			case 7:
				System.out.println("Average Salary of Labour - " + Employees.averageSalLabour(person));
				break;

			case 8:
				System.out.println("Average Salary of Labour - " + Employees.averageSalSalesmans(person));
				break;

			case 9:
				System.out.println("Average Salary of Labour - " + Employees.averageSalClerks(person));
				break;
			case 10:
				Box<Employee> b1 = new Box<>();
//				Employee e = (Employee) person[];
				System.out.println("Total Salary of Employees - " + b1.printEmployee(person));
				break;
			}

		} while (choice != 0);
	}

}

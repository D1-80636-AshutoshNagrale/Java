package Que3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		boolean bool = true;

		do {
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DELETE EMPLOYEE");
			System.out.println("3. FIND EMPLOYEE");
			System.out.println("4. SORT EMPLOYEES");
			System.out.println("5. UPDATE EMPLOYEE");
			System.out.println("0. EXIT");
			System.out.println("=========================");
			System.out.println("ENTER YOUR CHOICE : ");
			int key = sc.nextInt();

			switch (key) {
			case 1:
				Employee e = new Employee();
				e.accept(sc);
				list.add(e);
				break;
			case 2:
				for (Employee employee : list) {
					System.out.println(employee);
				}
				System.out.println("=====================================");
				System.out.println("Enter id of employee you wanna delete :");
				int id = sc.nextInt();
				int index = 0;
				Employee emp = null;
				if (list.isEmpty() == false) {
					for (Employee employee : list) {
						if (employee.getId() == id) {
							index = list.indexOf(employee);
							emp = employee;
							break;
						}
					}
					if (index == list.indexOf(emp)) {
						list.remove(index);
						System.out.println("Employee removed successfully");
						System.out.println("==================================");
						break;
					} else {
						System.out.println("Employee with given id not found");
						System.out.println("==================================");
						break;
					}
				} else {
					System.out.println("list is empty");
					System.out.println("=================================");
				}
				break;

			case 3:
				for (Employee employee : list) {
					System.out.println(employee);
				}
				System.out.println("Enter id of Employee");
				int id2 = sc.nextInt();

				int index1 = 0;
				Employee emp1 = null;

				if (!list.isEmpty()) {
					for (Employee employee : list) {
						if (employee.getId() == id2) {
							index1 = list.indexOf(employee);
							emp1 = employee;
							break;
						}
					}
					if (index1 == list.indexOf(emp1)) {
						System.out.println(list.get(index1));
						System.out.println("===========================");
						System.out.println("Employee found successfully");
						System.out.println("===========================");
					} else {
						System.out.println("Employee with given id not found");
						System.out.println("================================");
					}
				} else {
					System.out.println("List is empty");
					System.out.println("=============");
				}
				break;

			case 4:
				if (!list.isEmpty()) {

					Collections.sort(list);
					System.out.println("Sorted list : ");
					System.out.println("===============================");
					for (Employee employee : list) {
						System.out.println(employee);
					}
					System.out.println("===============================");
				} else {
					System.out.println("List is empty");
				}
				break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id3 = sc.nextInt();

				Employee key3 = new Employee();
				key3.setId(id3);
				int index3 = list.indexOf(key3);
				if (index3 == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = list.get(index3);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.accept(sc);
					list.set(index3, newEmp);// VERY IMPORTANT LINE
				}
				break;

			case 0:
				System.out.println("Thank you for using the application");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (bool);
	}
}

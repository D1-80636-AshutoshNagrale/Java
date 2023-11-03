package Que4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		class SalDesOrder implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {
				int diff = -Double.compare(o1.getSalary(), o2.getSalary());
				return diff;
			}
		}
		Scanner sc = new Scanner(System.in);

		Queue<Employee> queue = new PriorityQueue<Employee>(new SalDesOrder());
		boolean bool = true;
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employees");
			System.out.println("3. Display all employees");
			System.out.println("0. EXIT");
			System.out.println("========================");
			System.out.println("Enter your choice");
			int key = sc.nextInt();

			switch (key) {
			case 1:
				Employee employee = new Employee();
				employee.accept(sc);
				queue.offer(employee);
				break;

			case 2:
				queue.poll();
				System.out.println("Employee having highest salary is deleted successfully");
				System.out.println("=======================================================");
				for (Employee employee3 : queue) {
					System.out.println(employee3);
				}
				System.out.println("=======================================================");
				break;

			case 3:
				System.out.println("==========================================");
				for (Employee employee1 : queue) {
					System.out.println(employee1);
				}
				System.out.println("==========================================");
				break;
			case 0:
				System.out.println("Program terminated successfully");
				bool = false;
				break;

			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (bool);
	}
}

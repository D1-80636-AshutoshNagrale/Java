package Que8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Employees you want : ");

		Emp[] arr = new Emp[sc.nextInt()];
		int key;

		for (int i = 0; i < arr.length; i++) {

			System.out.printf(
					"WHOW DO YOU WANT TO HIRE ?\n1. MANAGER\n2. CLERK\n3. LABOR\n=============\nENTER YOUR CHOICE : ");

			key = sc.nextInt();
			switch (key) {
			case 1:
				arr[i] = new Manager();
				arr[i].acceptEmployee(sc);
				break;
			case 2:
				arr[i] = new Clerk();
				arr[i].acceptEmployee(sc);
				break;
			case 3:
				arr[i] = new Labor();
				arr[i].acceptEmployee(sc);
				break;

			default:
				System.out.println("****** WRONG CHOICE ENTERED ******");
				break;
			}

		}
//		for (Emp emp : arr) {
//			System.out.printf(
//					"WHOW DO YOU WANT TO HIRE ?\n1. MANAGER\n2. CLERK\n3. LABOR\n=============\nENTER YOUR CHOICE : ");
//
//			key = sc.nextInt();
//			switch (key) {
//			case 1:
//				emp = new Manager();
//				emp.acceptEmployee(sc);
//				break;
//			case 2:
//				emp = new Clerk();
//				emp.acceptEmployee(sc);
//				break;
//			case 3:
//				emp = new Labor();
//				emp.acceptEmployee(sc);
//				break;
//
//			default:
//				System.out.println("****** WRONG CHOICE ENTERED ******");
//				break;
//			}
		System.out.println("================================================");
		for (Emp emp : arr) {
			System.out.println(emp);
		}
		System.out.println("================================================");

		double totalSalary = Emp.calcTotalIncome(arr);
		System.out.println("Total salary of all employees : " + totalSalary);
	}
}

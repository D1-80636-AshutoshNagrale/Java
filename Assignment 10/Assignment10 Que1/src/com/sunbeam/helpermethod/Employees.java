package com.sunbeam.helpermethod;

import com.sunbeam.Person;
import com.sunbeam.employee.Clerk;
import com.sunbeam.employee.Labour;
import com.sunbeam.employee.Salesman;

public class Employees {

	public static double averageSalLabour(Person[] arr) {
		double total = 0;
		int count = 0;
		
		for(Person p: arr) {
			if(p != null) {
				if(p instanceof Labour) {
					Labour labour = (Labour)p;
					total = total + labour.getSalary();
					count++;
				}
			}
		}
		
		return total/count;
	}
	public static double averageSalSalesmans(Person[] arr) {
		double total = 0;
		int count = 0;
		
		for(Person p : arr) {
			if( p != null) {
				if(p instanceof Salesman) {
					Salesman salesman = (Salesman)p;
					total = total + salesman.getSalary();
					count++;
				}
			}
		}
		
		return total/count;
		
	}
	public static double averageSalClerks(Person[] arr) {
		double total = 0;
		int count = 0;
		
		for(Person p : arr) {
			if(p != null) {
				if(p instanceof Clerk) {
					Clerk clerk = (Clerk)p;
					total = total + clerk.getSalary();
					count++;
				}
			}
		}
		
		return total/count;
		
	}
	
}

package com.sunbeam.generic;

import com.sunbeam.Employee;
import com.sunbeam.Person;

public class Box <T extends Employee>{

	private T obj;	
	double total = 0;
	
	public double printEmployee(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Employee) {
				total = total + arr[i].getSalary();
			}
		}
		return total;
	}

}

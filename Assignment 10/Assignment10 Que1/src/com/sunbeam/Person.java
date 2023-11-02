package com.sunbeam;

import java.util.Scanner;

import com.sunbeam.employeeexception.EmployeeException;

public class Person {
	String name;
	int age;
	
	Scanner sc = new Scanner(System.in);
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void acceptData() {
		System.out.print("Enter Name - ");
		name = sc.next();
		this.setName(name);
		System.out.print("Enter Age - ");
		age = sc.nextInt();
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 || age < 18) {
			throw new EmployeeException("Age must be greater than 18 >= ", age);
		}
		this.age = age;
	}
	
	public void displayData(){
		System.out.println("Name - " + name);
		System.out.println("Age - " + age);
	}
	
	@Override
	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
		return super.toString() + String.format("Name - %s Age - %d ", this.name, this.age);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person)obj;
		return this.name == other.name && this.age == other.age;
	}
	
	
}

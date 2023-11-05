package Que7;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	private String name;
	private int rollNo;
	private int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);// this will generate hashCode only on the basis of rollNo field
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;// i.e. Students with same rollNo cannot be present
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", rollNo=");
		builder.append(rollNo);
		builder.append(", marks=");
		builder.append(marks);
		builder.append("]");
		return builder.toString();
	}

	public void acceptStudent(Scanner sc) {
		System.out.println("Enter name of Student");
		this.name = sc.next();
		System.out.println("Enter roll number of Student");
		this.rollNo = sc.nextInt();
		System.out.println("Enter marks of Student");
		this.marks = sc.nextInt();
		System.out.println("******** STUDENT ACCEPTED SUCCESSFULLY ********");
	}

}

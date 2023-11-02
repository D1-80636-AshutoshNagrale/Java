package Que2;

import java.util.Objects;

public class Student  {//implements Comparable<Student>
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, marks, name, roll);
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
		return Objects.equals(city, other.city)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [roll=");
		builder.append(roll);
		builder.append(", name=");
		builder.append(name);
		builder.append(", city=");
		builder.append(city);
		builder.append(", marks=");
		builder.append(marks);
		builder.append("]");
		return builder.toString();
	}


//	@Override
//	public int compareTo(Student o) {
//		int diff = Integer.compare(this.roll, o.roll);
//		return 0;
//	}

}

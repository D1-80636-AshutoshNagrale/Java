package Que2;

import java.util.Objects;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if ((!name.equals(null)) && name.matches("^[a-zA-Z]*$")) {
			this.name = name;
		} else {
			throw new EmployeeException(name);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age <= 60 && age != 0) {
			this.age = age;
		} else {
			throw new EmployeeException(String.valueOf(age));
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}

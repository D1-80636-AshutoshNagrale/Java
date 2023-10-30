package Que3;

public class Person implements Cloneable {
	private int age;
	private double weight;
	private String name;
	private Date dob;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int age, double weight, String name, Date dob) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", weight=" + weight + ", name=" + name + ", dob=" + dob + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person temp = (Person) super.clone();
		temp.dob = (Date) this.dob.clone();
		return temp;
	}
}

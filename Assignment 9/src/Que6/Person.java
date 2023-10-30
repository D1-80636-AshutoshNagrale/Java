package Que6;
import java.util.Iterator;
import java.util.Scanner;

//Declare an enum for Gender (MALE, FEMALE). Create a class Person 
//with fields name, age and gender. In main(), create a array of Person. 
//Write a menu driven program (using enum), to add new person, 
//display all people, find a person by name.

enum Gender {
	MALE, FEMALE
}

public class Person {
	public String name;
	public int age;
	public String gender;

	void accept(Scanner sc) {
		System.out.println("Enter name : ");
		this.name = sc.next();
		System.out.println("Enter age : ");
		this.age = sc.nextInt();
		System.out.println("********* PERSON ACCEPTED SUCCESSFULLY************");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		Scanner sc = new Scanner(System.in);

		Gender[] genders = Gender.values();

		int counter = 0;

		int value = 2;

		boolean tf = true;

		do {
			System.out.println("Enter 1 to add persons");
			System.out.println("Enter 2 to display all people");
			System.out.println("Enter 3 to find person by name");
			System.out.println("Enter 0 to exit");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				do {
					System.out.println("Enter 0 to add male person");
					System.out.println("Enter 1 to add female person");
					int choice = sc.nextInt();

					Gender g = genders[choice];

					switch (g) {
					case MALE:
						if (counter < 3) {
							persons[counter] = new Person();
							persons[counter].gender = "male";
							persons[counter].accept(sc);
							counter++;
							value--;
						} else {
							System.out.println("Only 3 persons can be added.");
						}
						break;
					case FEMALE:
						if (counter < 3) {
							persons[counter] = new Person();
							persons[counter].gender = "female";
							persons[counter].accept(sc);
							counter++;
							value--;
						} else {
							System.out.println("Only 3 persons can be added.");
						}
						break;

					default:
						System.out.println("Wrong choice entered");
						break;
					}

				} while (value >= 0);

				break;
			case 2:
				for (Person person : persons) {
					System.out.println(person);
					System.out.println("*****************************");
				}
				break;
			case 3:
				System.out.println("Enter name : ");
				String name1 = sc.next();
				for (Person person : persons) {
					if (person.name.equals(name1)) {// equals() method of Object class checks the data inside the object
						System.out.println(person.toString());
						System.out.println("*********** PERSON DISPLAYED SUCCESSFULLY **********");
					}
				}
				break;
			case 0:
				tf = false;
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice entered");
				break;
			}

		} while (tf);
	}
}

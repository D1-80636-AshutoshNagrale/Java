package Que7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	// As we're using Map Data Structure, it's mandatory to use
	// equals() and hashCode() method...in order to check equality of
	// key class (i.e Student's class rollNo field)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();

		int value = 1;
		int key = 0;

		do {
			System.out.printf(
					"1. ADD STUDENT\n2. REMOVE STUDENT\n3. UPDATE STUDENT\n4. DISPLAY ALL STUDENTS\n0. EXIT\n====================\nENTER YOUR CHOICE :");
			key = sc.nextInt();

			switch (key) {
			case 1:
				Student s = new Student();
				s.acceptStudent(sc);
				map.put(s.getRollNo(), s);
				break;
			case 2:
				if (!map.isEmpty()) {
					System.out.println("Enter roll number of Student to be removed : ");
					int rno = sc.nextInt();
					if (map.containsKey(rno)) {
						map.remove(rno);
						System.out.println("************* STUDENT REMOVED SUCCESSFULLY *************");
					} else {
						System.out.println("Student with entered roll number not found");
						System.out.println("======================================");
					}
				} else {
					System.out.println("Map is empty");
					System.out.println("=============");
				}
				break;
			case 3:
				if (!map.isEmpty()) {
					System.out.println("Enter roll number of Student to be updated : ");
					int rno = sc.nextInt();
					if (map.containsKey(rno)) {
						Student stu = map.get(rno);

						System.out.println("Enter name to be updated");
						stu.setName(sc.next());
						System.out.println("Enter marks to be updated");
						stu.setMarks(sc.nextInt());

						map.put(stu.getRollNo(), stu);
						System.out.println(stu);
						System.out.println("************* STUDENT UPDATED SUCCESSFULLY *************");
					} else {
						System.out.println("Student with entered roll number not found");
						System.out.println("======================================");
					}
				} else {
					System.out.println("Map is empty");
					System.out.println("=============");
				}

				break;
			case 4:

				if (!map.isEmpty()) {

					Set<Entry<Integer, Student>> e = map.entrySet();
					e.forEach(x -> System.out.println(x));
					System.out.println("************* STUDENTS DISPLAYED SUCCESSFULLY *************");

				} else {
					System.out.println("Map is empty");
					System.out.println("=============");
				}

				break;

			case 0:
				value = 0;
				break;
			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (value != 0);

	}
}

package Que2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] arr = new Student[7];
		arr[0] = new Student(4, "Ashu", "Bhandara", 98);
		arr[1] = new Student(3, "Pari", "Amr", 98);
		arr[2] = new Student(2, "Deepak", "Pauni", 75);
		arr[6] = new Student(7, "Mandar", "Pauni", 80);
		arr[3] = new Student(5, "Janak", "Nagpur", 65);
		arr[4] = new Student(1, "Tejas", "Yavat", 60);
		arr[5] = new Student(6, "Mosin", "Yavat", 55);

		SortCityDescMarksDesc cityDescMarksDesc = new SortCityDescMarksDesc();

		Arrays.sort(arr, cityDescMarksDesc);

		for (Student student : arr) {
			System.out.println(student);
		}
	}
}

package Que1;

import java.util.Comparator;

public class Main {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Double[] arr = new Double[] { 1.1, 1.7, 1.4, 1.0, 1.6 };

		System.out.println("Before Sorting");
		System.out.println("==============");
		for (Double double1 : arr)
			System.out.println(double1);
		System.out.println();
		
		selectionSort(arr, new SortArray());

		System.out.println("After Sorting");
		System.out.println("==============");
		for (Double double1 : arr)
			System.out.println(double1);
	}
}

package Que3;

import java.util.function.Predicate;

public class Que3Main {
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "Nilesh","Akbars", "Shubham", "Pratik", "Omkar", "Prashant", "Ashu" };
		// call countIf() to count number of strings have length more than 6 -- using
		// anonymous inner class

		System.out.println(countIf(arr, str -> str.length() >= 6));

//		int cnt = countIf(arr, new Predicate<String>() {
//			public boolean test(String s) {
//				return s.length() > 6;
//			}
//		});
		// System.out.println("Result: " + cnt); // 2

		// call countIf() to count number of strings have length more than 6 -- using
		// lambda expressions
	}
}

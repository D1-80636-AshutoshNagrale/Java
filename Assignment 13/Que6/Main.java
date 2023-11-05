package Que6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ashutosh
 *
 */
public class Main {
	public static void main(String[] args) {

		// Yes we do need to override equals() and hashCode() in key class i.e Book
		// class
		// as equality will be checked using equals() and hashCode() method
		// using the isbn of Book

		Scanner sc = new Scanner(System.in);

		Map<String, Book> map = new HashMap<String, Book>();

		int key = 1;

		do {
			System.out.printf(
					"1. ADD BOOK\n2. FIND BOOK\n3. DISPLAY ALL BOOKS\n0. EXIT\n===================================\nENTER YOUR CHOICE :");
			key = sc.nextInt();
			switch (key) {

			case 1:
				Book b = new Book();
				b.acceptBook(sc);
				map.put(b.getIsbn(), b);
				System.out.println("=====================================");
				System.out.println("BOOK ADDED SUCCESSFULLY !");
				System.out.println("=====================================");
				break;

			case 2:
				System.out.println("Enter isbn of book :");
				String isbn = sc.next();
				if (map.containsKey(isbn)) {
					Book b1 = map.get(isbn);
					System.out.println(b1);
					System.out.println("======================================================");
				} else {
					System.out.println("Book with isbn not found");
					System.out.println("=========================");
				}
				break;

			case 3:
				if (!map.isEmpty()) {
					System.out.println("===========================================================");
					
					Set<Entry<String, Book>> e = map.entrySet();
					e.forEach(x -> System.out.println(x));////////////////////// IMP ////////////////////////////
					
					System.out.println("===========================================================");
				} else {
					System.out.println("Map is empty");
				}
				break;

			default:
				System.out.println("Wrong choice entered");
				break;
			}
		} while (key != 0);

//		set.add(new Book("1", 1000.0, "ABN", 120));
//		set.add(new Book("6", 6000.0, "EDL", 600));
//		set.add(new Book("3", 3000.0, "MZX", 300));
//		set.add(new Book("5", 5000.0, "CXB", 500));
//		set.add(new Book("2", 2000.0, "KLD", 200));
//		set.add(new Book("4", 4000.0, "DKF", 400));
//		set.add(new Book("4", 4444.4, "DDD", 444));// Duplicate isbn book entry

//		Iterator<Book> itr = set.iterator();
//		while (itr.hasNext()) {
//			Book b = itr.next();
//			System.out.println(b);
//		}

	}
}

//Natural Ordering means which follows Comparator or Comparable
//TreeSet follows Natural Ordering

//Duplicate elements are not present in Treeset and it takes new values
//based on the field on which comparision is done using Comparable or Comparator
//Comparator is given more priority than Comparable

//on running this program, we'll get ClassCastException because
//Book cannot be cast to class java.lang.Comparable
//ONLY IF WE DO NOT IMPLEMENTS COMPARABLE

//TreeSet does't check equality using equals() and hashCode() method
//as Natural Ordering is followed...Comparable or Comparator should always be used with TreeSet

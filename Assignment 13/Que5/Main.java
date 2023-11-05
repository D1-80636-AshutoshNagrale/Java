package Que5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ashutosh
 *
 */
public class Main {
	public static void main(String[] args) {

		Set<Book> set = new TreeSet<Book>((x, y) -> -Double.compare(x.getPrice(), y.getPrice()));
		// highest priority of Natural Ordering will be given to Comparator instead of
		// Comparable
		set.add(new Book("1", 1000.0, "ABN", 120));
		set.add(new Book("6", 6000.0, "EDL", 600));
		set.add(new Book("3", 3000.0, "MZX", 300));
		set.add(new Book("5", 5000.0, "CXB", 500));
		set.add(new Book("2", 2000.0, "KLD", 200));
		set.add(new Book("4", 4000.0, "DKF", 400));
		set.add(new Book("4", 4444.4, "DDD", 444));// Duplicate isbn book entry

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
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

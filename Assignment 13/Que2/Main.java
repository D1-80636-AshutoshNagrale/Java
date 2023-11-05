package Que2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ashutosh
 *
 */
public class Main {
	public static void main(String[] args) {

		Set<Book> set = new HashSet<Book>();
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
//				Book [isbn=1, price=1000.0, authorName=ABN, quantity=120]
//				Book [isbn=2, price=2000.0, authorName=KLD, quantity=200]
//				Book [isbn=3, price=3000.0, authorName=MZX, quantity=300]
//				Book [isbn=4, price=4000.0, authorName=DKF, quantity=400]
//				Book [isbn=5, price=5000.0, authorName=CXB, quantity=500]
//				Book [isbn=6, price=6000.0, authorName=EDL, quantity=600]
	}
}
//In HashSet if we overrride hashCode() and equals() method and check equality
//only on the basis of "isbn" then Book with same isbn cannot be accepted twice
//it will just consider the new Book with isbn and remove the old book

//Since it is HashSet...book will be stored a/c to the hash values generated
//by hashCode() method.

//if you don't override hashCode() and equals(), then same Book object cannot be saved
//in HashSet as equality will be checked using hashCode() and equals() method
//depending on all the fields.

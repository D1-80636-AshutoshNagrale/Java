package Que1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
//	Java TreeSet class implements the Set interface that uses a tree structure to store elements.
//	It contains Unique Elements. It does not allow null elements.

// As per the definition a set object does not allow duplicate values 
// but it does allow at most one null value. Null values in HashSet −
// The HashSet object allows null values but, you can add only one null element to it.

// The HashMap class is roughly equivalent to Hashtable, except that it
// is unsynchronized and permits nulls. (HashMap allows null values as
// key and value whereas Hashtable doesn't allow nulls). HashMap does not
// guarantee that the order of the map will remain constant over time.

	public static void main(String[] args) {

//		Collection<String> c = new ArrayList<String>();//multiple null values are allowed

		// Collection<String> c = new HashSet<>();// only single null value is allowed
		// in HashSet as duplicate null values
		// are not allowed in Set interface
		// O/P given a/c to hashCode values

		// Collection<String> c = new LinkedHashSet<>();// only single null value is
		// allowed
		// in HashSet as duplicate null values
		// are not allowed in Set interface
		// O/P given a/c to hashCode values
//insertion order is preserved

		Collection<String> c = new TreeSet<>(); // in TreeMap no null values are at all allowed and it diredctly throws
												// NullPointerException
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}
}

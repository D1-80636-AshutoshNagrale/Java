package Que1;

public class StringEx {
	public static void main(String[] args) {
		String s1 = "Sunbeam";
		String s11 = "Sunbeam";
		System.out.println(s1 == s11); // true
		System.out.println(s1.equals(s11)); // true

		System.out.println("****************************");

		String s2 = new String("Sunbeam");
		String s22 = new String("Sunbeam");
		System.out.println(s2 == s22); // false
		System.out.println(s1.equals(s2)); // true

		System.out.println("****************************");

		String s3 = "Sunbeam";
		String s33 = new String("Sunbeam");
		System.out.println(s3 == s33); // false
		System.out.println(s3.equals(s33)); // true

		System.out.println("****************************");

		String s4 = "Sunbeam";
		String s44 = "Sun" + "beam";
		System.out.println(s4 == s44); // true
		System.out.println(s4.equals(s44)); // true

		System.out.println("****************************");

		String s5 = "Sunbeam";
		String s55 = "Sun";
		String s555 = s55 + "beam";
		System.out.println(s5 == s555); // false
		System.out.println(s5.equals(s555)); // true

		System.out.println("****************************");

		String s6 = "Sunbeam";
		String s66 = new String("Sunbeam").intern();// this intern() method will
		// adds String object into the String Pool
		System.out.println(s6 == s66); // true
		System.out.println(s6.equals(s66)); // true

		System.out.println("****************************");

		String s7 = "Sunbeam";
		String s77 = "SunBeam";
		System.out.println(s7 == s77); // false
		System.out.println(s7.equals(s77)); // false
		System.out.println(s7.equalsIgnoreCase(s77)); // true
		System.out.println(s7.compareTo(s77)); // 32
		System.out.println(s7.compareToIgnoreCase(s77)); // 0
	}
}

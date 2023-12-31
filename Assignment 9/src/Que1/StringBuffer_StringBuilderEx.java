package Que1;

public class StringBuffer_StringBuilderEx {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Sunbeam");
		StringBuffer s2 = new StringBuffer("Sunbeam");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false

		System.out.println("************************************");

		StringBuffer s11 = new StringBuffer("Sunbeam");
		String s22 = new String("Sunbeam");
		// System.out.println(s11 == s22); // Incompatible operand types StringBuffer
		// **********************************
		// and String
		System.out.println(s1.equals(s2)); // false

		System.out.println("************************************");

		String s111 = new String("Sunbeam");
		StringBuffer s222 = new StringBuffer("Sunbeam");
		System.out.println(s111.equals(s222)); // false
		System.out.println(s1.equals(s222.toString())); // false

		System.out.println("************************************");

		StringBuffer s1111 = new StringBuffer("Sunbeam");
		StringBuffer s2222 = s1.reverse();
		System.out.println(s1111 == s2222); // ???
		System.out.println(s1111.equals(s2222)); // ???

		System.out.println("*************************************");
		StringBuilder s3 = new StringBuilder("Sunbeam");
		StringBuilder s4 = new StringBuilder("Sunbeam");
		System.out.println(s3 == s4); // false
		System.out.println(s1.equals(s2)); // false

		System.out.println("*************************************");

		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32
	}
}

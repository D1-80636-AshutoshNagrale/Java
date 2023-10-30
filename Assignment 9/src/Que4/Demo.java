package Que4;

public class Demo {
	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("12314321");
		StringBuilder s1 = new StringBuilder(s.reverse());
		// System.out.println(s);
		if (s == s1) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}

		
		
		String s11 = "1234321";
		String s22 = "";
		for (int i = s11.length() - 1; i >= 0; i--) {
			s22 = s22 + s11.charAt(i);
		}
		// System.out.println(s2);
		if (s22.equals(s11)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}
	}
}

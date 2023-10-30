package Que2;

public class StringConversoions {
	public static void main(String[] args) {
		String s1 = "Bank Of Maharashtra";
		String[] s11 = s1.split(" ");

		for (String string : s11) {
			System.out.print(string.charAt(0));
		}
		System.out.println();
		System.out.println("*******************************");

		String s2 = "this is string";
		String[] s22 = s2.split(" ");

		for (String string : s22) {
			// System.out.println(string);
			System.out.print(string.substring(0, 1).toUpperCase() + string.substring(1) + " ");
		}
		System.out.println();
		System.out.println("*******************************");

		String s3 = "Example";
		for (int i = 0; i < s3.length(); i++) {

			if (i % 2 == 0) {
				// System.out.print(s3.substring(i,1).toUpperCase());
				System.out.print(s3.toUpperCase().charAt(i));
			} else {
				System.out.print(s3.substring(i, i + 1));
			}
		}
		System.out.println();
		System.out.println("*******************************");

		String s4 = "www.sunbeaminfo.com";
		System.out.println(s4.replace("com", "in"));
	}
}

package Que1;

public class StringExamples {
	public static void main(String[] args) {

		String s1 = "Sunbeam";
		String s2 = "Sunbeam";
		String s3 = new String("Sunbeam");
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true

		System.out.println("***************************");

		String str1 = "Sunbeam";
		String str2 = "Sun";
		String str3 = str2 + "beam";
		System.out.println(str1 == str3);// false
		System.out.println(str1.equals(str3));// true
	}
}

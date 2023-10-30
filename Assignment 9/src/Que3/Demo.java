package Que3;

public class Demo {
	public static void main(String[] args) {
		String[] str = { "Ashutosh", "Baban", "Nagrale", "Mala" };

		for (String string : str) {
			if (string.endsWith("a") || string.endsWith("e") || string.endsWith("i") || string.endsWith("o")
					|| string.endsWith("u")) {
				System.out.println(string);
			}
		}
	}
}

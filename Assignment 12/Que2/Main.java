package Que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Bhandara");
		list.add("Nagpur");
		list.add("Yavatmal");
		list.add("Thiruvananthapuram");

		String str = Collections.max(list);
		System.out.println("Highest length of String : " + str);
	}
}

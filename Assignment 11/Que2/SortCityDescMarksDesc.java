package Que2;

import java.util.Comparator;

public class SortCityDescMarksDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int diff = -o1.getCity().compareTo(o2.getCity());
		if (diff == 0)
			diff = -Double.compare(o1.getMarks(), o2.getMarks());
		return diff;
	}

}

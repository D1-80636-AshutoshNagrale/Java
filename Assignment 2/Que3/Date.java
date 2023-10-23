package Assignment2.Que3;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 0) {
			this.month = 0;
		}
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day < 0) {
			this.day = 0;
		}
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 0) {
			this.year = 0;
		}
		this.year = year;
	}

	void displayDate() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
		;
	}
}

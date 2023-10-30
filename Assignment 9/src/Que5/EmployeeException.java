package Que5;

public class EmployeeException extends RuntimeException {
	String value;

//	int value;
	public EmployeeException() {
		// TODO Auto-generated constructor stub
		super("Invalid value !");
	}

	public EmployeeException(String value) {
		super("Invalid value " + value + " entered !");
		this.value = value;
//
//	public EmployeeException(int value) {
//		// TODO Auto-generated constructor stub
//		this.value = value;

	}
//
//	public int getValue() {
//		return value;
//	}
//	

}

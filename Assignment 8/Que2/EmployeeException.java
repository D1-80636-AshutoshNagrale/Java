package Que2;

public class EmployeeException extends RuntimeException {
	String value;

//	int value;
	public EmployeeException(String value) {
		super("Invalid value !");
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

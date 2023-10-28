package Que2;

public class EmployeeException extends RuntimeException {
	String value;

	public EmployeeException(String value) {
		super("Invalid value !");
		this.value = value;
	}

	
}

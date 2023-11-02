package com.sunbeam.employeeexception;

public class EmployeeException extends RuntimeException{
	
	private String field;
	private double invalidValue;
	
	public EmployeeException() {
		super("Invalid values");
	}

	public EmployeeException(String field, double invalidValue) {
		this.field = field;
		this.invalidValue = invalidValue;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public double getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(double invalidValue) {
		this.invalidValue = invalidValue;
	}
	
}

package com.skillstorm;

public class InvalidSalaryException extends InvalidPayException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSalaryException(String message) {
		super(message);
	}
}
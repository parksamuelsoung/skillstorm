package com.skillstorm;

public class InvalidSizeException extends IllegalArgumentException{

	private static final long serialVersionUID = 1L;
	
	public InvalidSizeException() {
		
	}
	
	public InvalidSizeException(String message) {
		super(message);
	}

}

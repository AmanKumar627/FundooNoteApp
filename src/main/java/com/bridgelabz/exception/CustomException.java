package com.bridgelabz.exception;

@SuppressWarnings("serial")
public class CustomException extends RuntimeException {

	private String name;
	private String message;

	public CustomException(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

package com.infosys.exception;

public class MissingItemException extends RuntimeException{
	private String message;

	public MissingItemException(String message) {
		super(message);
		this.message = message;
	}

	public MissingItemException() {
	}

}

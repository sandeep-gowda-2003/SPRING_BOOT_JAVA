package com.infosys.exception;

public class BlogAldreadyExistsException extends RuntimeException {
	private String message;

	public BlogAldreadyExistsException(String message) {
		super(message);
		this.message = message;
	}

	public BlogAldreadyExistsException() {
	}

}

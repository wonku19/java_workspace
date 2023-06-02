package com.kh.practice2.exception;

public class DuplicateNameException extends Exception{

	public DuplicateNameException() {
		this("this is DuplicateNameException...");
	}
	
	public DuplicateNameException(String message) {
		super(message);
	}
}

package com.cg.service;

public class InvalidException extends Exception {
	private String msg;

	public InvalidException(String message) {
		msg = message;
	}

}

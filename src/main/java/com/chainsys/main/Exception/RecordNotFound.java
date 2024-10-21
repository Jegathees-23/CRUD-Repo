package com.chainsys.main.Exception;

public class RecordNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecordNotFound(String error) {
		
		super(error);
	}
}

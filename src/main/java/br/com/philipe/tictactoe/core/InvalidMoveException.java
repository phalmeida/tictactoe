package br.com.philipe.tictactoe.core;

public class InvalidMoveException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMoveException(String message) {
		super(message);
	}

}

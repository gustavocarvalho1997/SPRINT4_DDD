package br.com.fiap.sprint4.exception;

@SuppressWarnings("serial")
public final class InvalidCredentialsException extends Exception{
	public InvalidCredentialsException(String message) {
		super(message);
	}
}//CLASS
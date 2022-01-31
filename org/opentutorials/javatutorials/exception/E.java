package org.opentutorials.javatutorials.exception;

import java.io.IOException;

public class E {
	void throwArithmeticException() {
		throw new ArithmeticException();// unchecked exception: 예외처리를 해도되고 안해도됨.
	}
	void throwIOException() {
		try {
			throw new IOException(); // checked exception : 반드시 예외처리를 해야됨.
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

package org.opentutorials.javatutorials.exception;

import java.io.IOException;

public class E {
	void throwArithmeticException() {
		throw new ArithmeticException();// unchecked exception: ����ó���� �ص��ǰ� ���ص���.
	}
	void throwIOException() {
		try {
			throw new IOException(); // checked exception : �ݵ�� ����ó���� �ؾߵ�.
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

package org.opentutorials.javatutorials.exception;

class DivideException extends Exception { // -> Exception : checked, RuntimeException : unchecked
	DivideException() { // �⺻������ ���� ���� 
		super();
	}

	DivideException(String message) { // ��������
		super(message);
	}
}

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right; // 0
	}

	public void divide() throws DivideException{
		if (this.right == 0) {
			throw new DivideException("0���� �����������ϴ�.");
		}
		System.out.print(this.left / this.right);

	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
		}

	}
}
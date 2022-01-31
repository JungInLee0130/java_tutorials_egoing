package org.opentutorials.javatutorials.exception;

class DivideException extends Exception { // -> Exception : checked, RuntimeException : unchecked
	DivideException() { // 기본생성자 수동 생성 
		super();
	}

	DivideException(String message) { // 직접구현
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
			throw new DivideException("0으로 나눌수없습니다.");
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
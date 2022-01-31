package org.opentutorials.javatutorials.exception;

class A {
	private int[] arr = new int[3];

	A() { // 생성자
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second){
        try {
    	System.out.println(arr[first] / arr[second]); // arithmeticException, ArrayIndexOutOfBoundsException
        } catch(ArithmeticException e) { // else if
        	System.out.println("ArithmeticException");
        } catch(ArrayIndexOutOfBoundsException e) // else if // ctrl + space -> 최적 자동입력
        {
        	System.out.println("ArrayIndexOutOfBoundsException");
        } catch(Exception e) { // else
        	System.out.println("Exception");
        } finally {
            System.out.println("finally");      	
        }      	
    }
}

public class ExceptionDemo1 {
	public static void main(String[] args) {
		A a = new A();
		a.z(10, 1);
		a.z(1, 0);
		a.z(2, 1);
	}
}
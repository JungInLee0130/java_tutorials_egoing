package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A{
    public abstract int b();
    
    //public abstract int c(){System.out.println("Hello")}
   //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
   
    public void d(){
        System.out.println("world");
    }
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다 . 
}

class B extends A{
	public int b() {
		return 1;
	}
}

public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
    }
}
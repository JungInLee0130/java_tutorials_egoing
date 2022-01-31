package org.opentutorials.javatutorials.polymorphism;

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}

class B2 extends A{
	public String x() {return "B2.x";}
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B();
        A obj2 = new B2();
        obj.x();
        //obj.y();
        System.out.println(obj.x());
        // �������̵��� �켱������ ���߿� �����Ѱ�.
        System.out.println(obj2.x());
    } 
}
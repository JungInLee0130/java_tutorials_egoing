package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println((double)this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication(); // 자식 클래스 1
        c1.division(); // 자식클래스 1-1
    }
 
}
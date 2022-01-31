package org.opentutorials.javatutorials.overriding.example1;
 
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    // 부모클래스의 sum
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return (this.left + this.right) / 2;
    }
}
 
class SubstractionableCalculator extends Calculator {
     
	// 자식클래스의 sum -> 이게 실행됨
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public void substract() { 
        System.out.println(this.left - this.right);
    }
    
    public int avg() {
    	return super.avg();
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        // sum 실행
        c1.sum();
        c1.avg(); 
        c1.substract();
    }
}
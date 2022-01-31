package org.opentutorials.javatutorials.accessmodifier.inner;

class Calculator{
    private int left, right; // 메인함수에서 직접변경 불가
     
    public void setOprands(int left, int right){ // private 변수를 사용 
        this.left = left;
        this.right = right;
    }
    private int _sum(){ // 연산은 private로 설정
        return this.left+this.right;
    }
    public void sumDecoPlus(){ // 형식적인것은 public으로 설정후 private 메소드를 사용함.
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}
  
public class CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}
package org.opentutorials.javatutorials.accessmodifier.inner;

class Calculator{
    private int left, right; // �����Լ����� �������� �Ұ�
     
    public void setOprands(int left, int right){ // private ������ ��� 
        this.left = left;
        this.right = right;
    }
    private int _sum(){ // ������ private�� ����
        return this.left+this.right;
    }
    public void sumDecoPlus(){ // �������ΰ��� public���� ������ private �޼ҵ带 �����.
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
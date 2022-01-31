package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // for 반복문안에서만 정의된 지역변수 i
        }
        char[] i = null;
		System.out.println(i); 
    }
 
}
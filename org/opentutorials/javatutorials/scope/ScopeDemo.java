package org.opentutorials.javatutorials.scope;

// 지역변수라서 아무 영향을 미치지않음

public class ScopeDemo {
	 
    static void a() {
        int i = 0; 
    }
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}
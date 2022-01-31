package org.opentutorials.javatutorials.collection;
 
import java.util.ArrayList; // import 해야됨.
 
public class ArrayListDemo {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        System.out.println();
         
        ArrayList<String> al = new ArrayList<String>(); // 콜렉션 중 하나 // Object임 // <String> 타입으로 저장
        al.add("one");// Object type
        al.add("two");
        al.add("three"); // 데이터를 추가해도 OutOfBoundsException 에러 발생 안함.
        for(int i=0; i<al.size(); i++){ // al.size() = arrayObj.length
        	String value = al.get(i);
            System.out.println(al.get(i)); // arrayObj[index] = al.get(index)
        }
    }
 
}

/* 컬렉션즈 프레임워크

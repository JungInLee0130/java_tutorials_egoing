package org.opentutorials.javatutorials.collection;
 
import java.util.ArrayList; // import �ؾߵ�.
 
public class ArrayListDemo {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; ������ �߻��Ѵ�.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        System.out.println();
         
        ArrayList<String> al = new ArrayList<String>(); // �ݷ��� �� �ϳ� // Object�� // <String> Ÿ������ ����
        al.add("one");// Object type
        al.add("two");
        al.add("three"); // �����͸� �߰��ص� OutOfBoundsException ���� �߻� ����.
        for(int i=0; i<al.size(); i++){ // al.size() = arrayObj.length
        	String value = al.get(i);
            System.out.println(al.get(i)); // arrayObj[index] = al.get(index)
        }
    }
 
}

/* �÷����� �����ӿ�ũ

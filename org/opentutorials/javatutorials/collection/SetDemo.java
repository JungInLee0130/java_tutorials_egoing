package org.opentutorials.javatutorials.collection;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
 
public class SetDemo {
 
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>(); // A: 1,2,3
        A.add(1);
        A.add(2);
        A.add(3);
         
        Collection<Integer> B = new HashSet<Integer>(); // B: 3,4,5
        B.add(3);
        B.add(4);
        B.add(5);
         
        ArrayList<Integer> C = new ArrayList<Integer>(); // C: 1,2
        C.add(1);
        C.add(2);
         
        System.out.println(A.containsAll(B)); // false (부분집합이 아니다)
        System.out.println(A.containsAll(C)); // true (부분집합이다)
         
        //A.addAll(B); // 합집합
        //A.retainAll(B); // 교집합
        //A.removeAll(B); // 차집합
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
        
        Iterator hi2 = B.iterator();
        while(hi2.hasNext()){
            System.out.println(hi2.next());
        }
        
        Iterator hi3 = C.iterator();
        while(hi3.hasNext()){
            System.out.println(hi3.next());
        }
    }
 
}
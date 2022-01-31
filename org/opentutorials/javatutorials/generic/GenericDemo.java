package org.opentutorials.javatutorials.generic;
interface Info{
	public abstract int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel() {
    	return this.rank;
    }
}
class Person <T extends Info>{ // Info의 자식들만 들어올수있는 제네릭클래스
	public T info;
	Person(T info){ 
		this.info = info;
		info.getLevel();
	}
}
public class GenericDemo {
    public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(1));
		Person<String> p2 = new Person<String>("부장");
    }
}
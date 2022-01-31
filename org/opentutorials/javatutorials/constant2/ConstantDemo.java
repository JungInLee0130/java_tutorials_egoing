package org.opentutorials.javatutorials.constant2;
 
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color){
		/* System.out.println("call Constructor " + this); */
		this.color = color;
	}	
}

enum Company{
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo {    
    public static void main(String[] args) {
    	
    	for (Fruit f: Fruit.values()) {
    		System.out.println(f);
    	}
    	
		/*
		 * Fruit type = Fruit.APPLE; switch(type){ case APPLE: System.out.println(57 +
		 * " kcal, color " + Fruit.APPLE.getColor() ); break; case PEACH:
		 * System.out.println(34 + " kcal, color " + Fruit.PEACH.getColor() ); break;
		 * case BANANA: System.out.println(93 + " kcal, color " +
		 * Fruit.BANANA.getColor() ); break; }
		 */
    }
 
} 
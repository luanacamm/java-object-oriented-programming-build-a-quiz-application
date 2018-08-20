public class ClassesAndObjects {
	
	public static void main (String[] args) {
		
		Dog obj1 = new Dog();
		obj1.bark();
		obj1.walk();
	}

}

class Dog {
	
	String breed;
	String color;
	
	void bark() {
		
		System.out.println("Barks");
	}
	
	void walk() {
		
		System.out.println("Walks");
	}
}
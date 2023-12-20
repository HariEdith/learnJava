package learnJava.PolyMorphism;


//Run-Time Polymorphism (Dynamic Binding):
class Animals {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animals {
   
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Animal {
	public static void main(String args[]) {
		
		Animals a= new Animals();
		Dog d=new Dog();
		a.makeSound();
		d.makeSound();
		
	}
	
}
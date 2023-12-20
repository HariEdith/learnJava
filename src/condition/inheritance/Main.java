package condition.inheritance;

//multilevel
class Grandparent {
    void grandparentMethod() {
    	 int i=10;
        System.out.println("Method in Grandparent class");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("Method in Parent class");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
    	
    	
        Child child = new Child();
        child.grandparentMethod(); // Inherited from Grand
       
        
}
    }
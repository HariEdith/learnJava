package learnJava.Interface;


interface MyInterface {
    
    void myMethod();

    void anotherMethod();

    int MY_CONSTANT = 42;
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Implementation of anotherMethod");
    }
}

public class Interface01 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.myMethod();
        myObject.anotherMethod();

        // Accessing the constant from the interface
        System.out.println("Constant value: " + MyInterface.MY_CONSTANT);
    }
}
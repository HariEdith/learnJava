package condition.inheritance;
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.methodA();
        myObject.methodB();
    }
}

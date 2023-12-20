package learnJava.PolyMorphism;

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int subtract(int a, int b) {
        return a - b;
    }

    
    
    public int multiply(int a, int b) {
        return a * b;
    }

    
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
}

public class MethodOverlodingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        
        int sum = calculator.add(5, 3);
        int diff = calculator.subtract(10, 2);
        int product = calculator.multiply(4, 5);
        int quotient = calculator.divide(10, 2);

        System.out.println("Sum (int): " + sum);
        System.out.println("Difference (int): " + diff);
        System.out.println("Product (int): " + product);
        System.out.println("Quotient (int): " + quotient);
    }
}

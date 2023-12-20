package learnJava.PolyMorphism;
class Operation {
	
	
    public double Operation(double num1, double num2) {
        return 0.0;
    }
}

class Addition extends Operation {
    @Override
    public double Operation(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction extends Operation {
    @Override
    public double Operation(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication extends Operation {
    @Override
    public double Operation(double num1, double num2) {
        return num1 * num2;
    }
}

class Division extends Operation {
    @Override
    public double Operation(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0.0;
        }
    }
}

public class MethodOverraidingExample {
    public static void main(String[] args) {
        Operation add = new Addition();
        Operation subtract = new Subtraction();
        Operation multiply = new Multiplication();
        Operation divide = new Division();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + add.Operation(num1, num2));
        System.out.println("Subtraction: " + subtract.Operation(num1, num2));
        System.out.println("Multiplication: " + multiply.Operation(num1, num2));
        System.out.println("Division: " + divide.Operation(num1, num2));
    }
}

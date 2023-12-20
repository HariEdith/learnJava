package learnJava.pattern;


public class MirroredPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces before asterisks
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
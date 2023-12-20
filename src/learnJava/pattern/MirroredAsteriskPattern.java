package learnJava.pattern;

public class MirroredAsteriskPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        for (int i = 1; i <= n; i++) {
            // Print spaces for the left side of the pattern
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print asterisks for the left side of the pattern
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

package learnJava.pattern;

public class Dimond {
	    public static void main(String[] args) {
	        int rows = 5; // Number of rows in the diamond

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  "); // Print spaces
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* "); // Print asterisks
	            }
	            System.out.println(); // Move to the next line
	        }

	       for (int i = rows - 1; i >= 1; i--) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  "); // Print spaces
	            }
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* "); // Print asterisks
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	

}

package learnJava.pattern;

public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 5; // Number of rows in the triangle

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println(); // Move to the next line
	        }

	}

}

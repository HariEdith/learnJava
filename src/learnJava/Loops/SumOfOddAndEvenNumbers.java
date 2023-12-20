package learnJava.Loops;

import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range from the user
        System.out.print("Enter the range of numbers");
        int range = scanner.nextInt();

        int sumOfEven = 0;
        int sumOfOdd = 0;

        // Calculate the sum of even and odd numbers
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                sumOfEven += i; // Add even numbers to th4e even sum( 2 + 4 + 6 + 8 + 10 + 12 = 42) 
            } else {
                sumOfOdd += i; // Add odd numbers to the odd sum( 1 + 3 + 5 + 7 + 9 + 11 = 36)
            }
        }


        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);

        scanner.close();
    }
}




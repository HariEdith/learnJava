package learnJava.Array;
import java.util.Arrays;
public class ArrayOperations {
    public static void main(String[] args) {
        // Define an array
        int[] numbers = {5, 2, 8, 1, 9};

        // Array length
        int length = numbers.length;
        System.out.println("Array Length: " + length);

        // Accessing Elements
        int firstElement = numbers[0];
        int secondElement = numbers[1];
        System.out.println("First Element: " + firstElement);
        System.out.println("Second Element: " + secondElement);

        // Sorting Arrays
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Copying Arrays
        int[] copy = Arrays.copyOf(numbers, 3);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        // Searching Arrays
        int searchValue = 8;
        int index = Arrays.binarySearch(numbers, searchValue);
        System.out.println("Index of " + searchValue + ": " + index);

        // Converting Arrays to Strings
        String arrayStr = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayStr);

        // Iterating Through Arrays
        System.out.println("Iterating Through Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }}

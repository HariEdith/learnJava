package learnJava.Array;
public class AddTwo2DArrays {
    public static void main(String[] args) {
        // Define two 2D arrays with the same dimensions
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Add the two arrays
        int[][] sumArray = addArrays(array1, array2);

                
        // Print the result
        System.out.println("Sum of two 2D arrays:");

        
        
        for (int i = 0; i < sumArray.length; i++) {
            for (int j = 0; j < sumArray[i].length; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    
    public static int[][] addArrays(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }
}


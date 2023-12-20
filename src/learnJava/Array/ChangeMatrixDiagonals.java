package learnJava.Array;
public class ChangeMatrixDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        changeDiagonals(matrix, 0, 0); // Change the main diagonal to 0
        System.out.println("\nMatrix with Main Diagonal Changed:");
        printMatrix(matrix);

        changeDiagonals(matrix, 1, 1); // Change the opposite diagonal to 1
        System.out.println("\nMatrix with Opposite Diagonal Changed:");
        printMatrix(matrix);
    }

    public static void changeDiagonals(int[][] matrix, int mainDiagonalValue, int oppositeDiagonalValue) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    // Main diagonal
                    matrix[i][j] = mainDiagonalValue;
                } else if (i == size - 1 - j) {
                    // Opposite diagonal
                    matrix[i][j] = oppositeDiagonalValue;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package learnJava.Array;
public class ThreeDArrayAddition {
    public static void main(String[] args) {
        int[][][] array1 = {
            {{1, 2, 3}, {4, 5, 6}},
            {{7, 8, 9}, {10, 11, 12}},
            {{8,6,7},{1,2,3}}
        };

        int[][][] array2 = {
            {{13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}},
            {{2,3,4},{8,7,3}}
        };

        int[][][] result = add3DArrays(array1, array2);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i][j].length; k++) {
                    System.out.print(result[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][][] add3DArrays(int[][][] array1, int[][][] array2) {
        int depth = array1.length;
        int rows = array1[0].length;
        int cols = array1[0][0].length;

        int[][][] result = new int[depth][rows][cols];

        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                }
            }
        }

        return result;
    }
}

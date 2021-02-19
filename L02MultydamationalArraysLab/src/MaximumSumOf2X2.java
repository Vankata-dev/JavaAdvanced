import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");


        int[][] matrix = readMatrix(Integer.parseInt(rowsAndCols[0]), scanner);

        int maxSum = Integer.MIN_VALUE;

        int maxRol = 0, maxCol = 0;


        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxRol = row;
                    maxCol = col;
                }
            }
        }


        System.out.println(matrix[maxRol][maxCol] + " " + matrix[maxRol][maxCol + 1]);
        System.out.println(matrix[maxRol + 1][maxCol] + " " + matrix[maxRol + 1][maxCol + 1]);
        System.out.println(maxSum);

    }

    private static int[][] readMatrix(int rows, Scanner scanner) {

        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }


}

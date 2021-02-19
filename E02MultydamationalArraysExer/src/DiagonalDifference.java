import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int [][] matrix = fillMatrix(scanner, rows);

        int firstDiagonal = firstDiagonalSum(matrix);
        int secondDiagonal = secondDiagonalSum(matrix);


        System.out.println(firstDiagonal - secondDiagonal);
    }

    private static int secondDiagonalSum(int[][] matrix) {
        int secondSum = 0;
        int row = 0;
        int col = 0;

        while (row < matrix.length && col < matrix.length) {
            secondSum+= matrix[row][col];
            row++;
            col++;
        }

        return secondSum;
    }

    private static int firstDiagonalSum(int[][] matrix) {
        int firstSum = 0;
        int row = matrix.length -1;
        int col = 0;

        while (row >= 0 && col < row) {
            firstSum += matrix[row][col];
            row--;
            col++;
        }
        return firstSum;
    }

    private static int[][] fillMatrix(Scanner scanner, int rowAndCol) {
        int[][] matrix = new int[rowAndCol][rowAndCol];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}

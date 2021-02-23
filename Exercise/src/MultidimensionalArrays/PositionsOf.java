package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = readArr(scanner);

        int[][] matrix = fillMatrix(scanner, dimentions[0]);

        int numberToFind = scanner.nextInt();
        boolean notFound = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == numberToFind) {
                    System.out.printf("%d %d%n", r, c);
                    notFound = true;
                }
            }
        }
        if (!notFound) {
            System.out.println("not found");
        }
    }

    private static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[][] fillMatrix(Scanner scanner, int row) {
        int[][] matrix = new int[row][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArr(scanner);
        }
        return matrix;
    }
}

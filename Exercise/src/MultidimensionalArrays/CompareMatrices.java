package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstMatrixRowsCols = readArr(scanner);

        int firstMatrixRow = firstMatrixRowsCols[0];
        int firstMatrixCol = firstMatrixRowsCols[1];

        int[][] firstMatrix = new int[firstMatrixRow][firstMatrixCol];
        fillMatrix(scanner, firstMatrixRow, firstMatrix);


        int[] secondMatrixRowCols = readArr(scanner);
        int secondMatrixRows = secondMatrixRowCols[0];
        int secondMatrixCol = secondMatrixRowCols[1];

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCol];
        fillMatrix(scanner, secondMatrixRows, secondMatrix);


        if (firstMatrixRow != secondMatrixRows || firstMatrixCol != secondMatrixCol) {
            System.out.println("not equal");
        }else {
            compareMatrix(firstMatrix, secondMatrix);
        }
    }

    private static void compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                int matrixOne = firstMatrix[row][col];
                int matrixTwo = secondMatrix[row][col];
                if (matrixOne != matrixTwo) {
                    System.out.println("not equal");
                }
            }
        }
        System.out.println("equal");
    }


    private static void fillMatrix(Scanner scanner, int matrixRow, int[][] matrix) {
        for (int i = 0; i < matrixRow; i++) {
            matrix[i] = readArr(scanner);
        }
    }

    private static int[] readArr(Scanner scanner) {
        int[] readArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        return readArr;
    }


}

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowAndCol = readArray(scanner);

        int rol = rowAndCol[0];
        int col = rowAndCol[1];

        System.out.println(rol);
        System.out.println(col);


        int [][] matrix = new int[rol][];

        fillMatrix(scanner, matrix);

        sumElementsOfMatrix(matrix);



    }

    private static void sumElementsOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int cow = 0; cow < matrix[row].length; cow++) {
                sum += matrix[row][cow];
            }
        }
        System.out.println(sum);
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row <matrix.length ; row++) {
           matrix[row] = readArray(scanner);
        }
    }

    public static int [] readArray (Scanner scanner){
        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        return arr;
    }
}

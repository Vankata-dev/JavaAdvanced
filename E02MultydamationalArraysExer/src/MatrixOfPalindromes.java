import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        char [][] matrix = new char[rowsAndCols[0]][rowsAndCols[1]];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

            }
        }

    }
}

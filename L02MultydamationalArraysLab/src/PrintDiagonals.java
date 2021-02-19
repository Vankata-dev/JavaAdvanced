import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int row = 0; row < matrix.length; row++) {
            int[] ints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = ints;
        }

        int row = 0, col = 0;

        while (row < rows && col < rows) {
            System.out.print(matrix[row++][col++] + " ");

        }
        System.out.println();

        row = rows - 1;
        col = 0;

        while (row >=0 && col < rows){
            System.out.print(matrix[row--][col++] + " ");
        }
    }

}
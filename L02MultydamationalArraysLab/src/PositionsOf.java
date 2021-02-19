import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] rowAndCol = readArray(scanner);

        int matrixRow = rowAndCol[0];
        int matrixCol = rowAndCol[1];

        int [][] matrix = new int[matrixRow][matrixCol];

        for (int row = 0; row < matrix.length ; row++) {
            int [] arr = readArray(scanner);
            matrix[row] = arr;
        }

        int serchNumber = scanner.nextInt();

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == serchNumber){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }


    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}

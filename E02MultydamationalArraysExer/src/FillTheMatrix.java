import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");

        int n = Integer.parseInt(tokens[0]);

        String patern = tokens[1];

        int[][] matrix = fillMatrix(n, patern);

        printMatrix(matrix);


    }

    private static int[][] fillMatrix(int n, String patern) {
        int[][] matrix = new int[n][n];

        if ("A".equals(patern)) {
            fillpaternA(matrix);
        } else if ("B".equals(patern)) {
            fillpaternB(matrix);

        }
        return matrix;
    }

    private static void fillpaternB(int[][] matrix) {
        int numb = 1;
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = numb++;

                }
            }else {
                for (int col = matrix.length -1 ; col >= 0 ; col--) {
                    matrix [col][row] = numb ++;
                }
            }
        }
    }
    private static void fillpaternA(int[][] matrix) {
        int numb = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = numb++;

            }
        }
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(String.format("%d ", element));
            }
            System.out.println();
        }
    }
}

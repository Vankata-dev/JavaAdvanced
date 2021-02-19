import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixRol = Integer.parseInt(scanner.nextLine());
        int matrixCol = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[matrixRol][];
        char[][] secondMatrix = new char[matrixRol][];

        for (int row = 0; row <firstMatrix.length ; row++) {
            firstMatrix[row] = readCharArr(scanner);
        }

        for (int row = 0; row < secondMatrix.length; row++) {
            secondMatrix[row] = readCharArr(scanner);
        }

        char[][] thirdMatrix = new char[matrixRol][matrixCol];
        for (int row = 0; row < matrixRol; row++) {
            for (int col = 0; col < matrixCol; col++) {
                char firstSymbol = firstMatrix[row][col];
                char secondSymbol = secondMatrix[row][col];
                thirdMatrix[row][col] = firstSymbol == secondSymbol ? firstSymbol : '*';
            }
        }
            printMatrix(thirdMatrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static char[] readCharArr(Scanner scanner){

        char [] charArr = scanner.nextLine(). replaceAll("\\s+", "").toCharArray();

        return charArr;
    }


}


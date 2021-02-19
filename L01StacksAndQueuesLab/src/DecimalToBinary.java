import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (input == 0){
            System.out.println(0);
            return;
        }

        while (input > 0 ){
            int digit = 0;
            digit = input % 2;
            binary.push(digit);
            input /= 2;
        }

        for (Integer integer : binary) {
            System.out.print(integer);
        }

    }
}

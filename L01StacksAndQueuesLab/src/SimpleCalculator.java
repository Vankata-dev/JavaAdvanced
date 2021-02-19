import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0))) {
                numbers.push(Integer.parseInt(token));
            } else {
                int rightOperator = Integer.parseInt(tokens[++i]);
                int leftOperant = numbers.peek();
                numbers.push(rightOperator);

                int result = token.equals("+")
                        ? leftOperant + rightOperator
                        : leftOperant - rightOperator;
                numbers.push(result);
            }
        }
        System.out.println(numbers.peek());
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command = "";

        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(number -> number += 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(number -> number *= 2).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(number -> number -= 1).toArray();
        Consumer<int[]> printArr = arr -> Arrays.stream(arr).forEach(number ->
                System.out.printf("%d ",number));

        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    numbers = addOne.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    printArr.accept(numbers);
                    break;
            }
            command = scanner.nextLine();
        }

    }
}

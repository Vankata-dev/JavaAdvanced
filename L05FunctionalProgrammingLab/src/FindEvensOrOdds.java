import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> isEaven = e -> e % 2 == 0;
        Predicate<Integer> isOdd = e -> e % 2 != 0;

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .


        String[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(e-> );



    }
}

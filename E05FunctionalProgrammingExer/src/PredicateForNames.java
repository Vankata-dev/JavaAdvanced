import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameLenght = Integer.parseInt(scanner.nextLine());

        Predicate<String> validLenght = name -> name.length() <= nameLenght;

        Arrays.stream(scanner.nextLine().split("\\s+")).filter(validLenght).forEach(System.out::println);
    }
}

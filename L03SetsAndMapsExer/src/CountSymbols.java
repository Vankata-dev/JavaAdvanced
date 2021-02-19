import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> ocurrences = new TreeMap<>();

        fillMap(input, ocurrences);

        ocurrences.forEach((k, v) ->
                System.out.printf("%s: %d time/s%n", k, v)
        );

    }

    private static void fillMap(String input, Map<Character, Integer> ocurrences) {
        for (int i = 0; i <input.length() ; i++) {
            char symbol = input.charAt(i);

            ocurrences.putIfAbsent(symbol, 0);
            ocurrences.put(symbol, ocurrences.get(symbol) +1);
        }
    }
}

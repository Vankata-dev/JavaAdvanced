import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")){

            resources.putIfAbsent(input, 0);
            resources.put(input, resources.get(input) + Integer.parseInt(scanner.nextLine()));

            input = scanner.nextLine();
        }

        resources.forEach((k, v) ->
                System.out.printf("%s -> %d%n", k , v)
        );

    }
}

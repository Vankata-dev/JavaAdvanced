import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String, String> namesAndEmails = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String[] tokens = scanner.nextLine().split("\\.");


            if (!tokens[1].equals("bg")){
                name = scanner.nextLine();
            }else {
                namesAndEmails.put(name, tokens[0] + "." + tokens[1]);
                name = scanner.nextLine();
            }
        }

        namesAndEmails.forEach((k, v) ->
                System.out.printf("%s -> %s%n",k , v)
        );
    }
}

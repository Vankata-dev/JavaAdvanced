import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");

        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!input[0].equals("search")){
            String name = input[0];
            String phoneNumber = input[1];

            phoneBook.put(name, phoneNumber);

            input = scanner.nextLine().split("-");
        }

        String names = scanner.nextLine();

        while (!names.equals("stop")){

            if (phoneBook.containsKey(names)){
                System.out.printf("%s -> %s%n",names, phoneBook.get(names) );
            }else {
                System.out.printf("Contact %s does not exist.%n", names);
            }

            names = scanner.nextLine();
        }


    }
}

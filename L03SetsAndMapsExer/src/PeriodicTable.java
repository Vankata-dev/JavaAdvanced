import java.util.*;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        while (n-- > 0){
            elements.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }

    }

}

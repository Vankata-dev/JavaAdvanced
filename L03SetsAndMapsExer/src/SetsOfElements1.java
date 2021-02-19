import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        int firstSize = line[0];
        int secondSize = line[1];

        while (firstSize-- > 0){
            firstSet.add(scanner.nextInt());
        }
        while (secondSize-- > 0 ){
            secondSet.add(scanner.nextInt());
        }

        for (Integer first : firstSet) {
            for (Integer second : secondSet) {
                if (first.equals(second)){
                    System.out.print(first + " ");
                }
            }

        }

    }

}

import java.util.*;
import java.util.stream.Collectors;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = new HashSet<>();
        Set<Integer> secondPlayer = new HashSet<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(value -> firstPlayer.add(value));
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(value -> secondPlayer.add(value));

        boolean deckOneIsFull = true;
        boolean deckTwoIsFull = true;
        int rounds = 50;

        for (int round = 0; round < 50; round++) {
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);

            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            } else {
                firstPlayer.remove(firstNumber);
                secondPlayer.remove(secondNumber);
            }

            if (firstPlayer.isEmpty()) {
                deckOneIsFull = false;
                return;
            } else if (secondPlayer.isEmpty()) {
                deckTwoIsFull = false;
                return;
            }
        }
        if (!deckOneIsFull){
            System.out.println("Second player win!");
            return;
        }else if (!deckTwoIsFull){
            System.out.println("First player win!");
            return;
        }
        int firstSum = 0;
        int secondSum = 0;
        for (Integer integer : firstPlayer) {
            firstSum+=integer;
        }
        for (Integer integer : secondPlayer) {
            secondSum+=integer;
        }

        if (firstSum> secondSum){
            System.out.println("First player win!");
        }else {
            System.out.println("Second player win!");
        }


    }
}
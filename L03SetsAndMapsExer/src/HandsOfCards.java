import java.util.*;
public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\: ");

        Map<String, Set<String>> playersCards = new LinkedHashMap<>();


        while (!input[0].equals("JOKER")) {


            input = scanner.nextLine().split("\\: ");
        }

        System.out.println();
    }

    public static int calculatePower(String card) {
        int power = 0;

        char cardType = card.charAt(0);

        if (Character.isDigit(cardType)) {
            power = Integer.parseInt(String.valueOf(cardType)) * secondCharPower(card.charAt(1));
        } else {
            switch (cardType) {
                case 'J':
                    power = 11 * secondCharPower(card.charAt(1));
                    break;
                case 'Q':
                    power = 12 * secondCharPower(card.charAt(1));
                    break;
                case 'K':
                    power = 13 * secondCharPower(card.charAt(1));
                    break;
                case 'A':
                    power = 14 * secondCharPower(card.charAt(1));
                    break;
            }

        }
        return power;

    }

    private static int secondCharPower(char secondChar) {
        int digit = 0;
        switch (secondChar) {
            case 'S':
                digit = 4;
                break;
            case 'H':
                digit = 3;
                break;
            case 'D':
                digit = 2;
                break;
            case 'C':
                digit = 1;
                break;
        }
        return digit;
    }

}



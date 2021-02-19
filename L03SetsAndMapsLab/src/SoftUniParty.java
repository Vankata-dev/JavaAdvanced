import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new HashSet<>();
        Set<String> regular = new HashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){
            if (Character.isDigit(input.charAt(0))){
                vip.add(input);
            }else {
                regular.add(input);
            }

            input = scanner.nextLine();
        }

        while (!input.equals("END")){
            if (Character.isDigit(input.charAt(0))){
                vip.remove(input);
            }else {
                regular.remove(input);
            }

            input = scanner.nextLine();
        }

        int total = vip.size() + regular.size();
        System.out.println(total);


        String vipDidntArrive = vip.stream().collect(Collectors.joining(System.lineSeparator()));
        String regDidntArrive = regular.stream().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(vipDidntArrive);
        System.out.println(regDidntArrive);
    }
}

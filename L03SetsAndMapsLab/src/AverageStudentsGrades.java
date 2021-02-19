import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> studentsGrades = new TreeMap<>();

        while (lines-- < lines){

            String[] studentInformation = scanner.nextLine().split("\\s+");

            String name = studentInformation[0];
            Double grade = Double.parseDouble(studentInformation[1]);

            studentsGrades.putIfAbsent(name, new ArrayList<>());

        }

    }
}
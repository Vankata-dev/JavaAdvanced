import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> studentsWithGrades = new TreeMap<>();

        while (n-- > 0){
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            studentsWithGrades.put(name, grades);
        }

        DecimalFormat fm = new DecimalFormat("#.###");
        studentsWithGrades.forEach((k, v) ->{
            System.out.print(String.format(
                    "%s is graduated with %f%n", k,
                    Arrays.stream (v).average().orElse(0)
            ));
        });
    }
}

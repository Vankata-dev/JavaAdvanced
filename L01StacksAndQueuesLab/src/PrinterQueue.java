import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filenames = scanner.nextLine();

        ArrayDeque<String> filesForPrinting = new ArrayDeque<>();

        while (!filenames.equals("print")) {

            if (filenames.equals("cancel")) {
                if (!filesForPrinting.isEmpty()) {
                    System.out.println("Canceled " + filesForPrinting.pollFirst());
                } else {
                    System.out.println("Printer is on standby");
                }
            }else if (!filenames.equals("cancel")){
                System.out.println(filenames);
                filesForPrinting.offer(filenames);
            }
            filenames = scanner.nextLine();
        }
    }
}

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }

            String[] pieces = sentence.split(",");
            if (Integer.valueOf(pieces[1]) > old) {
                old = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + old);
    }
}

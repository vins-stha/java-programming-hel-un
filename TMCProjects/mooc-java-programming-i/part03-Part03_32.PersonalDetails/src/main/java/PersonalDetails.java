
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0.0;
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }

            String[] pieces = sentence.split(",");

            sum += Integer.valueOf(pieces[1]);
            longestName = pieces[0].length() > longestName.length() ? pieces[0] : longestName;
            count++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sum / count));

    }
}

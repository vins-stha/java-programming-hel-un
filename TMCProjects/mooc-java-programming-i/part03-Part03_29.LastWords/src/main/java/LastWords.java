
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                return;
            }

            String[] pieces = sentence.split(" ");

            System.out.println(pieces[pieces.length-1]);

        }


    }
}

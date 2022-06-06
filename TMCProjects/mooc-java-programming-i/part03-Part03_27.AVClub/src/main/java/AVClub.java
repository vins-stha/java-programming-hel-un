
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                return;
            }
            int index = 0;
            String[] pieces = sentence.split(" ");

            while (index < pieces.length) {
                if (pieces[index].contains("av")) {
                    System.out.println(pieces[index]);
                }
                index++;
            }

        }

    }
}

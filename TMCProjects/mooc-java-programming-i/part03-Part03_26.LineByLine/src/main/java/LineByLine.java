
import java.util.Scanner;

public class LineByLine {

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
                System.out.println(pieces[index]);
                index++;
            }

        }

    }
}


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old=0;
        String oldest="";
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isEmpty()) {
                break;
            }

            String[] pieces = sentence.split(",");
            if (Integer.valueOf(pieces[1]) > old) {
                old = Integer.valueOf(pieces[1]);
                oldest = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldest);

    }
}

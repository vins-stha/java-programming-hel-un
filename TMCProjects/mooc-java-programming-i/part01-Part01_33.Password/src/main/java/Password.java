
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "Caput Draconis";
        System.out.println("Password?");
        String password = scan.nextLine();

        if (password.equals(text)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}

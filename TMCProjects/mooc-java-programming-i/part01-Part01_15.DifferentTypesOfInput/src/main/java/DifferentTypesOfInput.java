
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String message = scan.nextLine();

        System.out.println("Give an integer:");
        int intValue = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double dValue = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean bValue = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + dValue);
        System.out.println("You gave the boolean " + bValue);


    }
}

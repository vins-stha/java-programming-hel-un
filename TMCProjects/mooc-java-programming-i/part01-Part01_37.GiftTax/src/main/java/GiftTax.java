
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        int lowerLimit = 0;
        double tax = 0;
        double giftTax = 0.0;

        if (value < 5000) {
            System.out.println("No tax!");
            return;
        } else if (value == 5000) {
            giftTax = 100.0;
        } else if (value > 5000 && value < 25000) {
            lowerLimit = 100;
            tax = (double) 8 / 100;
            giftTax = (lowerLimit + ((value - 5000) * tax));

        } else if (value >= 25000 && value < 55000) {
            lowerLimit = 1700;
            tax = (double) 10 / 100;
            giftTax = (lowerLimit + ((value - 25000) * tax));

        } else if (value >= 55000 && value < 200000) {
            lowerLimit = 4700;
            tax = (double) 12 / 100;

            giftTax = (lowerLimit + ((value - 55000) * tax));

        } else if (value >= 200000 && value < 1000000) {
            lowerLimit = 22100;
            tax = (double) 15 / 100;
            giftTax = (lowerLimit + ((value - 200000) * tax));

        } else {
            lowerLimit = 142100;
            tax = (double) 17 / 100;
            giftTax = (lowerLimit + ((value - 1000000) * tax));

        }
        System.out.println("Tax: " + giftTax);

    }
}

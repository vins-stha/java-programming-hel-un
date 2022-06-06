
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int num : numbers) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
}

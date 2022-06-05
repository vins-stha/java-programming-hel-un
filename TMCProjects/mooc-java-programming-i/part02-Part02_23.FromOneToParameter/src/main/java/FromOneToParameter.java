import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.valueOf(scanner.nextLine());
        printUntilNumber(count);

    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

    }

}

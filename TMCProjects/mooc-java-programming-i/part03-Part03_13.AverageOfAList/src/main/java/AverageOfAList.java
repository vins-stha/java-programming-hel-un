
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int i = 0;
        int sum = 0;

        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }

        System.out.println("Average: " + ((double) sum / list.size()));

    }
}

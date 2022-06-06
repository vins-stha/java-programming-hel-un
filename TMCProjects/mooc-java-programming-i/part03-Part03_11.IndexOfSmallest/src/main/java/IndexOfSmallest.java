
import java.util.*;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int i = 0;
        int smallest = list.get(0);
        while (i < list.size()) {
            int num = list.get(i);

            if (num < smallest) {
                smallest = num;
            }
            i++;
        }
        System.out.println("Smallest number: " + smallest);

        i = 0;
        while (i < list.size()) {

            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
            i++;
        }
    }
}

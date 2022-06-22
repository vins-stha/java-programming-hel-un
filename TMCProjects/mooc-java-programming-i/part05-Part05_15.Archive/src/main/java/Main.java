
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> itemList = new ArrayList<>();
        while (true) {

            System.out.println("Identifier (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);

            if (!item.checkIdentifierExist(itemList)) {
                itemList.add(item);
            }
        }

        System.out.println("==Items==");

        for (Archive item : itemList) {
            System.out.println(item);
        }
    }
}

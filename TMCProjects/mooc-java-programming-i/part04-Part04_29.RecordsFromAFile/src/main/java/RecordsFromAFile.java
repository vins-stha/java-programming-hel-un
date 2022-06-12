
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while(fileReader.hasNextLine()){
                String[] items = fileReader.nextLine().split(",");
                String year = Integer.valueOf(items[1]) != 1? " years" : " year";
                System.out.println(items[0] + ", age: " + items[1] + year);
            }

        }catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }


    }
}

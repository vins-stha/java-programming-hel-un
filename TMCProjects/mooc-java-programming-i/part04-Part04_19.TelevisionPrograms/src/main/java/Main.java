import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> televisionPrograms = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            ;
            System.out.println("Duration: ");
            int time = Integer.valueOf(scanner.nextLine());

            televisionPrograms.add(new TelevisionProgram(name, time));
        }

        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram tvProgram : televisionPrograms) {
            if (tvProgram.getDuration() <= max) {
                System.out.println(tvProgram.getName() + ", " + tvProgram.getDuration() + " minutes");
            }
        }

    }
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesCount = 0;
        int wins = 0;
        int loss = 0;

        System.out.println("File:");
        String file = scanner.nextLine();
        System.out.println("Team:");
        String team = scanner.nextLine();

        try {
            Scanner fileReader = new Scanner(Paths.get(file));

            while (fileReader.hasNextLine()) {
                String[] game = fileReader.nextLine().split(",");

                if (game[0].equals(team) || game[1].equals(team)) {
                    gamesCount++;

                    if (game[0].equals(team)) {
                        if (Integer.valueOf(game[2]) > Integer.valueOf(game[3])) {
                            wins++;
                        } else {
                            loss++;
                        }
                    } else {
                        if (Integer.valueOf(game[3]) > Integer.valueOf(game[2])) {
                            wins++;
                        } else {
                            loss++;
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
    }

}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        int difference = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                if (data[0].equals(team) || data[1].equals(team)) {
                    games++;

                    if (data[0].equals(team)) {
                        difference = Integer.valueOf(data[2]) - Integer.valueOf(data[3]);
                        if (difference >= 0) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else {
                        difference = Integer.valueOf(data[3]) - Integer.valueOf(data[2]);
                        if (difference >= 0) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }

                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}

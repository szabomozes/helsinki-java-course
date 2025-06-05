
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfTheOldest = "";

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String data[] = nameAndAge.split(",");
            if (Integer.valueOf(data[1]) > oldestAge) {
                oldestAge = Integer.valueOf(data[1]);
                nameOfTheOldest = data[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);

    }
}

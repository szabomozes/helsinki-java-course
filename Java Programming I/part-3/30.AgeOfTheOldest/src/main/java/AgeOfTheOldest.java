
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String data[] = nameAndAge.split(",");
            if (Integer.valueOf(data[1]) > oldest) {
                oldest = Integer.valueOf(data[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}

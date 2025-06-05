
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String textByUser = scanner.nextLine();

            if (textByUser.equals("")) {
                break;
            }

            String parts[] = textByUser.split(" ");
            System.out.println(parts[0]);

        }

    }
}

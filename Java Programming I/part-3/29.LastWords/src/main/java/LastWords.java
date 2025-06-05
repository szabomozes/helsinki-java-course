
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String textByUser = scanner.nextLine();

            if (textByUser.equals("")) {
                break;
            }

            String parts[] = textByUser.split(" ");
            System.out.println(parts[parts.length - 1]);

        }

    }
}

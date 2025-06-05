
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String textByUser = scanner.nextLine();

            if (textByUser.equals("")) {
                break;
            }

            String parts[] = textByUser.split(" ");
            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }

        }

    }
}

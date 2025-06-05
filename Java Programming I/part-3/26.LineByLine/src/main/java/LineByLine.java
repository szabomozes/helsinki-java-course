
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String textByUser = scanner.nextLine();

            if (textByUser.equals("")) {
                break;
            }

            String parts[] = textByUser.split(" ");
            for (String word : parts) {
                System.out.println(word);
            }
        }

    }
}

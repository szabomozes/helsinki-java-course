
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int absoluteValue = 0;

        if (number < 0) {
            absoluteValue = number * (-1);
        } else {
            absoluteValue = number;
        }
        System.out.println(absoluteValue);
    }
}

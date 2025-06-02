
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int countNegative = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                System.out.println("Number of negative numbers: " + countNegative);
                break;
            }

            if (number < 0) {
                countNegative = countNegative + 1;
            }
        }

    }
}

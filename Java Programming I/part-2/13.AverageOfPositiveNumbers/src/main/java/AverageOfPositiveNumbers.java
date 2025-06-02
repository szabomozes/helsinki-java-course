
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int count = 0;
        int sumOfPositiveNumbers = 0;
        int countOfPositiveNumbers = 0;
        double averageOfPositiveNumbers = 0;

        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            count = count + 1;

            if (number == 0 && count > 0 && (count - countOfPositiveNumbers) < 0 || (count == 1 && number == 0)) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0 && countOfPositiveNumbers > 0) {
                averageOfPositiveNumbers = (double) sumOfPositiveNumbers / countOfPositiveNumbers;
                System.out.println(averageOfPositiveNumbers);
                break;
            }

            if (number > 0) {
                sumOfPositiveNumbers = sumOfPositiveNumbers + number;
                countOfPositiveNumbers = countOfPositiveNumbers + 1;
            }
        }

    }
}

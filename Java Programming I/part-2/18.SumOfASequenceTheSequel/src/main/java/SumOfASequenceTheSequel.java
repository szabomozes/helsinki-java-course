
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

    }
}

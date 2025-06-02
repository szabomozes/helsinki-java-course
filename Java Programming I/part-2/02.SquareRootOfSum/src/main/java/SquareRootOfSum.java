
import java.util.Scanner;
import java.util.*;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Integer.valueOf(scanner.nextLine());
        double secondNumber = Integer.valueOf(scanner.nextLine());

        double squareRootOfSum = Math.sqrt(firstNumber + secondNumber);
        System.out.println((int) squareRootOfSum);
    }
}

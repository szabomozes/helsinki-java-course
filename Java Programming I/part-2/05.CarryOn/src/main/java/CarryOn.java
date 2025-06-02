
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shall we carry on?");
        String userAnswer = scanner.nextLine();
        while (!userAnswer.equals("no")) {
            System.out.println("Shall we carry on?");
            userAnswer = scanner.nextLine();
        }

    }
}

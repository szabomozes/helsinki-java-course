
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        String password = "Caput Draconis";

        System.out.println("Password?");
        String passwordByUser = scan.nextLine();

        if (passwordByUser.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}

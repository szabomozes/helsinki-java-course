
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user1[] = { "alex", "sunshine" };
        String user2[] = { "emma", "haskell" };

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if ((username.equals(user1[0]) && password.equals(user1[1]))
                || (username.equals(user2[0]) && password.equals(user2[1]))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

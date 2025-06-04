
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println();

        System.out.print("Search for? ");
        String searchedElement = scanner.nextLine();

        if (list.contains(searchedElement)) {
            System.out.println(searchedElement + " was found!");
        } else {
            System.out.println(searchedElement + " was not found!");
        }

    }
}

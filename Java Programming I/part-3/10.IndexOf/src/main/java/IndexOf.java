
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int searchedNumber = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchedNumber) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            System.out.println(searchedNumber + " is at index " + indexes.get(i));
        }

    }
}

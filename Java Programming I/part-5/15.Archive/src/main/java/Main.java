
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> identifiers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            identifiers.add(id);
            names.add(name);

        }

        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < identifiers.size(); i++) {
            if (!unique.contains(identifiers.get(i))) {
                unique.add(identifiers.get(i));
                System.out.println(identifiers.get(i) + ": " + names.get(i));
            }
        }

    }
}

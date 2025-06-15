
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birds.add(new Bird(name, latinName));
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                boolean exists = false;
                for (Bird b : birds) {
                    if (b.getName().equals(bird)) {
                        b.newObservation();
                        exists = true;
                    }
                }
                if (!exists) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                for (Bird b : birds) {
                    System.out.println(b);
                }
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                for (Bird b : birds) {
                    if (b.getName().equals(bird)) {
                        System.out.println(b);
                    }
                }

            }

        }

    }

}

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        System.out.print("Command: ");
        String command = scanner.nextLine();

        if (command.equals("end")) {
            System.out.println("Bye bye!");
        } else if (command.equals("add")) {
            System.out.print("Word: ");
            String word = scanner.nextLine();
            System.out.print("Translation: ");
            String translation = scanner.nextLine();

            simpleDictionary.add(word, translation);
            start();
        } else if (command.equals("search")) {
            System.out.print("To be translated: ");
            String word = scanner.nextLine();
            String translation = simpleDictionary.translate(word);
            if (translation != null) {
                System.out.println("Translation: " + translation);
            } else {
                System.out.println("Word " + word + " was not found");
            }
            start();

        } else {
            System.out.println("Unknown command");
            start();
        }
    }
}

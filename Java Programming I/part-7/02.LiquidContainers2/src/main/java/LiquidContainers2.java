
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] commandAndAmount = input.split(" ");
            String command = commandAndAmount[0];
            int amount = Integer.valueOf(commandAndAmount[1]);
            if (amount <= 0) {
                System.out.println();
                continue;
            }
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    second.add(first.contains());
                    first.remove(100);
                }
                if (first.contains() >= amount) {
                    first.remove(amount);
                    second.add(amount);
                }

            } else if (command.equals("remove")) {
                second.remove(amount);
            }
            System.out.println();

        }
    }

}

import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.toDoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String newTask = scanner.nextLine();

                toDoList.add(newTask);
            } else if (command.equals("list")) {
                toDoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());

                toDoList.remove(id);
            }
        }
    }
}

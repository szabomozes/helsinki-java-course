
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try (Scanner read = new Scanner(file);) {
            while (read.hasNextLine()) {
                String name = read.nextLine();
                int time = Integer.valueOf(read.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (read.hasNextLine()) {
                    String line = read.nextLine();
                    if (line.trim().isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }
                recipes.add(new Recipe(name, time, ingredients));

            }
            read.close();
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
        System.out.println(
                "\nCommands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    System.out.println(r);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.wordInName(word)) {
                        System.out.println(r);
                    }
                }

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.timeIsLessThan(maxTime)) {
                        System.out.println(r);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe r : recipes) {
                    if (r.containsTheIngredient(ingredient)) {
                        System.out.println(r);
                    }
                }

            }

        }

    }

}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");
                names.add(parts[0]);
                ages.add(Integer.valueOf(parts[1]));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ", age: " + ages.get(i) + " years");
        }
    }
}

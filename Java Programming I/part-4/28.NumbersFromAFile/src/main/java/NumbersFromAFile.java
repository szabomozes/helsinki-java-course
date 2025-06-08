
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        int number = 0;

        try (Scanner filScanner = new Scanner(Paths.get(file))) {
            while (filScanner.hasNextLine()) {
                String data = filScanner.nextLine();
                number = Integer.valueOf(data);
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Numbers: " + count);

    }

}

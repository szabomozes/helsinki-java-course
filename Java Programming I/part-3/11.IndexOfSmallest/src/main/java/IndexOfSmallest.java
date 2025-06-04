
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }

            numbers.add(number);
        }
        System.out.println();

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        ArrayList<Integer> indexesOfMin = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == min) {
                indexesOfMin.add(i);
            }
        }

        System.out.println("Smallest number: " + min);
        for (int i = 0; i < indexesOfMin.size(); i++) {
            System.out.println("Found at index: " + indexesOfMin.get(i));
        }

    }
}


import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("Give two indices to swap:");
        int firstIndex = Integer.valueOf(scanner.nextLine());
        int secondIndex = Integer.valueOf(scanner.nextLine());
        System.out.println();

        int helper = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = helper;

        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

    }

}

import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        int count = 0;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
                indexOfSmallest = count;
            }
            count++;
        }
        return indexOfSmallest;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static void sort(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }

}

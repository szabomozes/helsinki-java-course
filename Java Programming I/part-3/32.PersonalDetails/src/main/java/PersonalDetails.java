
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int lengthOfTheLongestName = 0;

        int sumOfBirthYears = 0;
        int countNames = 0;

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String data[] = nameAndAge.split(",");
            if (data[0].length() > lengthOfTheLongestName) {
                longestName = data[0];
                lengthOfTheLongestName = data[0].length();
            }

            countNames++;
            sumOfBirthYears = sumOfBirthYears + Integer.valueOf(data[1]);

        }

        System.out.println("Longest name: " + longestName);
        double average = sumOfBirthYears / (double) (countNames);
        System.out.println("Average of the birth years: " + average);

    }
}

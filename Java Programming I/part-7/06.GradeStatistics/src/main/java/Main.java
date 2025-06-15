
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.

        Course course = new Course();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }

            course.add(point);
        }

        System.out.println("Point average (all): " + course.average());
        if (course.passingAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + course.passingAverage());
        }
        System.out.println("Pass percentage: " + course.passingPercentage());

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < course.numberOfGrade(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

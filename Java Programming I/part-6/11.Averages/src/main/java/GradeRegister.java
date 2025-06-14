
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.examPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        int numberOfGrades = 0;
        int sumOfGrades = 0;
        for (int grade : grades) {
            numberOfGrades++;
            sumOfGrades = sumOfGrades + grade;
        }
        double average = (double) (sumOfGrades) / numberOfGrades;
        if (numberOfGrades == 0) {
            return -1;
        }
        return average;
    }

    public double averageOfPoints() {
        int numberOfPoints = 0;
        int sumOfPoints = 0;
        for (int point : examPoints) {
            numberOfPoints++;
            sumOfPoints = sumOfPoints + point;
        }
        double average = (double) (sumOfPoints) / numberOfPoints;
        if (numberOfPoints == 0) {
            return -1;
        }
        return average;
    }
}

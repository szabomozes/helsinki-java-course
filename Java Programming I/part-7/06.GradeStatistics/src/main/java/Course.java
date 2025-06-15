import java.util.ArrayList;

public class Course {
    private ArrayList<Integer> coursePoints;

    public Course() {
        this.coursePoints = new ArrayList<>();
    }

    public void add(int point) {
        if (point >= 0 && point <= 100) {
            coursePoints.add(point);
        }
    }

    public double average() {
        int sum = 0;
        double average = 0;
        int numberOfPoints = coursePoints.size();
        for (int p : coursePoints) {
            sum = sum + p;
        }
        average = (double) (sum) / numberOfPoints;
        return average;
    }

    public double passingAverage() {
        int sum = 0;
        int count = 0;
        double average = 0;
        for (int p : coursePoints) {
            if (p >= 50) {
                sum = sum + p;
                count++;
            }
        }
        if (count == 0) {
            return count;
        }
        average = (double) (sum) / count;
        return average;
    }

    public double passingCount() {
        int count = 0;
        for (int p : coursePoints) {
            if (p >= 50) {
                count++;
            }
        }
        return count;
    }

    public double passingPercentage() {
        return 100 * passingCount() / (double) (coursePoints.size());
    }

    public int grade(int point) {
        int grade = 0;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else if (point >= 90) {
            grade = 5;
        }
        return grade;
    }

    public int numberOfGrade(int grade) {
        int count = 0;
        for (int p : coursePoints) {
            if (grade(p) == grade) {
                count++;
            }
        }
        return count;
    }

}

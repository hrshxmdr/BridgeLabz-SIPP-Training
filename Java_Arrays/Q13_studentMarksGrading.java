import java.util.Scanner;

public class Q13_studentMarksGrading {

    // Method to calculate grade based on percentage
    public static char calculateGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // 2. Create arrays
        int[][] marks = new int[numStudents][3]; // 2D array for Physics, Chemistry, Math
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // 3. Take input for marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Math";
                int mark;
                do {
                    System.out.print(subject + ": ");
                    mark = scanner.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid mark! Please enter a value between 0 and 100.");
                    }
                } while (mark < 0 || mark > 100);
                marks[i][j] = mark;
            }
        }

        // 4. Compute percentage and grade
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        // 5. Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s%-10s%-10s%-10s%-15s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Percentage", "Grade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-15.2f%-10c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}

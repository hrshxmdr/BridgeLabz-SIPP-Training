import java.util.Scanner;

public class Q14_BMICalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Arrays to store values
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step 3: Input height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter data for person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            heights[i] = sc.nextDouble();

            // Step 4: Calculate BMI
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            // Step 4.5: Determine status
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        // Step 5: Display output
        System.out.printf("\n%-10s%-10s%-10s%-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f%-10.2f%-10.2f%-15s\n", weights[i], heights[i], bmi[i], status[i]);
        }

        sc.close(); // Good practice to close the Scanner
    }
}

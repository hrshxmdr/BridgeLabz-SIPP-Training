import java.util.Scanner;

public class Q36_BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Display BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        scanner.close();
    }
}

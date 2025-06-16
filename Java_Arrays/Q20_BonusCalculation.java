import java.util.Scanner;

public class Q20_BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        int[] years = new int[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter salary and years of service for Employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            int yr = sc.nextInt();

            if (sal < 0 || yr < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }

            salary[i] = sal;
            years[i] = yr;
        }

        // Calculate bonuses and totals
        for (int i = 0; i < EMPLOYEES; i++) {
            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Bonus Report ---");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "Emp#", "Old Salary", "Years", "Bonus", "New Salary");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("%-10d%-15.2f%-15d%-15.2f%-15.2f\n", (i + 1), salary[i], years[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}

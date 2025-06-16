import java.util.Scanner;

public class Q11_NaturalNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
            return;
        }
        
        // Using for loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        
        // Using formula
        int sumFormula = n * (n + 1) / 2;
        
        System.out.println("Sum using loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumLoop == sumFormula) {
            System.out.println("Both results are correct and match!");
        } else {
            System.out.println("Results don't match. There's an error.");
        }
    }
}
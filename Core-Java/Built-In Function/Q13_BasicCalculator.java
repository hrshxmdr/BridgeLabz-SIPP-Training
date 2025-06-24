import java.util.Scanner;

public class Q13_BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Divide");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = 0;
        boolean valid = true;
        switch (choice) {
            case 1: result = add(a, b); break;
            case 2: result = subtract(a, b); break;
            case 3: result = multiply(a, b); break;
            case 4: 
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                } else {
                    result = divide(a, b);
                }
                break;
            default: 
                System.out.println("Invalid choice.");
                valid = false;
        }
        if (valid) {
            System.out.println("Result: " + result);
        }
    }

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }
} 
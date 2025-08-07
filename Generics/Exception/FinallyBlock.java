import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int b = scanner.nextInt();
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed!");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
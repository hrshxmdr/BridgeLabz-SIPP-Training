import java.util.Scanner;

public class Q10_FactorialRecursion {
    public static void main(String[] args) {
        int n = takeInput();
        long result = factorial(n);
        displayResult(n, result);
    }

    static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is " + result);
    }
} 
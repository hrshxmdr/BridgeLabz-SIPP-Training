import java.util.Scanner;

public class Q11_GCD_LCM_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
} 
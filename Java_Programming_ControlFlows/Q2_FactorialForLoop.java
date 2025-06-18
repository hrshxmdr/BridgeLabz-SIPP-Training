import java.util.Scanner;
public class Q2_FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);
    }
}
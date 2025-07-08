import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter double a: ");
        double a = sc.nextDouble();

        System.out.print("Enter double b: ");
        double b = sc.nextDouble();

        System.out.print("Enter double c: ");
        double c = sc.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n", op1, op2, op3, op4);
    }
}
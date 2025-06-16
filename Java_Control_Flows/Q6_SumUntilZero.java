import java.util.Scanner;
public class Q6_SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, input;
        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            input = sc.nextDouble();
            if (input == 0) break;
            total += input;
        }
        System.out.println("Total sum: " + total);
    }
}
import java.util.Scanner;
public class Q8_SumUntilZeroBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to quit): ");
            double value = sc.nextDouble();
            if (value <= 0)
                break;
            total += value;
        }
        System.out.println("Total sum: " + total);
    }
}
import java.util.Scanner;
public class Q7_SumNaturalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= n)
            sum += i++;
        int formula = n * (n + 1) / 2;
        System.out.println("Loop sum: " + sum + ", Formula sum: " + formula);
    }
}
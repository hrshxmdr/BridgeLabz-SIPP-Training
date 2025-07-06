import java.util.Scanner;

public class Q8_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index >= maxFactors) {
                    maxFactors *= 2;
                    int[] temp = new int[maxFactors];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}

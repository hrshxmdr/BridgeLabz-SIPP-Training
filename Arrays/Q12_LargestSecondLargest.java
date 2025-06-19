import java.util.Scanner;

public class Q12_LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number != 0) {
            if (index == maxDigits) {
                maxDigits *= 2;
                int[] temp = new int[maxDigits];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + second);
    }
}

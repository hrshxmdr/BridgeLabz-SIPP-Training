import java.util.Scanner;

public class Q15_DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2 & 3: Count digits and store them in array
        int temp = number, count = 0;
        int[] digits = new int[20]; // assume max 20 digits

        while (temp != 0) {
            digits[count++] = temp % 10;
            temp /= 10;
        }

        // Step 4: Define frequency array and count
        int[] freq = new int[10]; // digits 0-9
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Step 5: Display result
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }
    }
}

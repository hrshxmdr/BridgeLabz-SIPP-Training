import java.util.Scanner;

public class Q1_PosNegEvenOddCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive and Even");
                else
                    System.out.println(num + " is Positive and Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last numbers are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First number is Greater than Last");
        } else {
            System.out.println("First number is Less than Last");
        }
    }
}

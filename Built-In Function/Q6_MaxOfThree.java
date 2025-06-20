import java.util.Scanner;

public class Q6_MaxOfThree {
    public static void main(String[] args) {
        int[] numbers = takeInput();
        int max = findMax(numbers[0], numbers[1], numbers[2]);
        System.out.println("Maximum of the three numbers: " + max);
    }

    static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.print("Enter first number: ");
        nums[0] = scanner.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = scanner.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = scanner.nextInt();
        return nums;
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
} 
import java.util.Scanner;

public class Q7_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid number.");
            return;
        }

        String[] result = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result[i] = "FizzBuzz";
            else if (i % 3 == 0)
                result[i] = "Fizz";
            else if (i % 5 == 0)
                result[i] = "Buzz";
            else
                result[i] = String.valueOf(i);
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}

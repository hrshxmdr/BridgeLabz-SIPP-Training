import java.util.Scanner;

public class Q25_multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }
        
        System.out.println("Multiples of " + number + " below 100:");
        int counter = 99;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
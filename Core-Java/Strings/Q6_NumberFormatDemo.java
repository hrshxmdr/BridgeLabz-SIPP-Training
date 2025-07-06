import java.util.Scanner;

public class Q6_NumberFormatDemo {

    public static void generateException(String input) {
        System.out.println("Attempting to parse: " + input);
        int number = Integer.parseInt(input); 
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (or letters to cause exception): ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception during generateException: " + e.getMessage());
        }

        handleException(input);
    }
}
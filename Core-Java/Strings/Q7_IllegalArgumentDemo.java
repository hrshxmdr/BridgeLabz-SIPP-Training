import java.util.Scanner;

public class Q7_IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println("Trying substring(5, 2)...");
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception during generateException: " + e.getMessage());
        }

        handleException(input);
    }
}
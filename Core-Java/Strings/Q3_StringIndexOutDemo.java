

import java.util.Scanner;
public class Q3_StringIndexOutDemo {

    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        
        System.out.println("Character at 100th index: " + text.charAt(100));
    }


    public static void handleException(String text) {
        System.out.println("\nHandling Exception...");
        try {
            System.out.println("Character at 100th index: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

   
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Caught Exception during generateException: " + e.getMessage());
        }

        
        handleException(input);
    }
}
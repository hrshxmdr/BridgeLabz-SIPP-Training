import java.util.Scanner;

public class Q9_PalindromeChecker {
    public static void main(String[] args) {
        String input = takeInput();
        boolean isPal = isPalindrome(input);
        displayResult(input, isPal);
    }

    static String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static void displayResult(String str, boolean isPal) {
        if (isPal) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
} 
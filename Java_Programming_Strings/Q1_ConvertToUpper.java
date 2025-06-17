import java.util.Scanner;

public class Q1_ConvertToUpper {

    public static String toUpperManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();
        String manualUpper = toUpperManual(input);

        boolean isEqual = compareStrings(builtInUpper, manualUpper);

        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Manual Uppercase:   " + manualUpper);
        System.out.println("Match: " + isEqual);
    }
}
import java.util.Scanner;

public class Q9_ManualSubstring {

    public static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String builtIn = text.substring(start, end);
        String manual = manualSubstring(text, start, end);

        System.out.println("Built-in substring: " + builtIn);
        System.out.println("Manual substring:   " + manual);
        System.out.println("Match: " + compareStrings(builtIn, manual));
    }
}
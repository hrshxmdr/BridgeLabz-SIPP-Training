import java.util.Scanner;

public class Q12_ManualTrim {

    public static int[] trimIndices(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1}; 
    }

    public static String manualSubstring(String text, int start, int end) {
        StringBuilder trimmed = new StringBuilder();
        for (int i = start; i < end; i++) {
            trimmed.append(text.charAt(i));
        }
        return trimmed.toString();
    }

    public static boolean compareStrings(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indices = trimIndices(input);
        String manualTrimmed = manualSubstring(input, indices[0], indices[1]);
        String builtInTrimmed = input.trim();

        System.out.println("Manual Trimmed: " + manualTrimmed);
        System.out.println("Built-in Trim:  " + builtInTrimmed);
        System.out.println("Match: " + compareStrings(manualTrimmed, builtInTrimmed));
    }
}
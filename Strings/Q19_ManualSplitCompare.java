import java.util.Scanner;

public class Q19_ManualSplitCompare {

    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length++);
            }
        } catch (Exception ignored) {}
        return length;
    }

   
    public static String[] manualSplit(String text) {
        text = text.trim() + " ";
        int wordCount = 0;
        for (int i = 0; i < getLength(text); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        StringBuilder word = new StringBuilder();
        int index = 0;

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void displayArray(String[] arr, String label) {
        System.out.print(label + ": ");
        for (String word : arr) {
            System.out.print("[" + word + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] builtInSplit = input.trim().split(" ");
        String[] manualSplitResult = manualSplit(input);

        displayArray(builtInSplit, "Built-in split");
        displayArray(manualSplitResult, "Manual split");

        boolean match = compareArrays(builtInSplit, manualSplitResult);
        System.out.println("Arrays match: " + match);
    }
}
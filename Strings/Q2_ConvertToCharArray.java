import java.util.Scanner;

public class Q2_ConvertToCharArray {

    public static char[] manualToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void printArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();

        char[] builtInChars = input.toCharArray();
        char[] manualChars = manualToCharArray(input);

        System.out.print("Built-in toCharArray: ");
        printArray(builtInChars);

        System.out.print("Manual conversion:    ");
        printArray(manualChars);

        boolean isEqual = compareArrays(builtInChars, manualChars);
        System.out.println("Arrays match: " + isEqual);
    }
}
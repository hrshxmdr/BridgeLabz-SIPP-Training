import java.util.Scanner;

public class Q20_StringLengthFinder {

    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.next();

        int manualLen = manualLength(input);
        int builtInLen = input.length();

        System.out.println("Manual length:  " + manualLen);
        System.out.println("Built-in length: " + builtInLen);
    }
}
import java.util.Scanner;

public class Q18_WordTable {

    public static String[] splitWords(String text) {
        text = text.trim() + " ";
        StringBuilder current = new StringBuilder();
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') count++;
        }
        String[] words = new String[count];
        int index = 0;
        for (char c : text.toCharArray()) {
            if (c != ' ') current.append(c);
            else {
                if (current.length() > 0) {
                    words[index++] = current.toString();
                    current.setLength(0);
                }
            }
        }
        return words;
    }

    public static int stringLength(String word) {
        int count = 0;
        try {
            while (true) word.charAt(count++);
        } catch (Exception ignored) {}
        return count;
    }

    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static void display(String[][] array) {
        System.out.println("Word\tLength");
        for (String[] row : array) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] result = wordLengths(words);
        display(result);
    }
}
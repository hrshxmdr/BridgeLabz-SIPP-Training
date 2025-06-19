import java.util.Scanner;

public class Q17_WordLengthFinder {

    public static String[] splitWords(String text) {
        text = text.trim() + " ";
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') count++;
        }
        String[] words = new String[count];
        StringBuilder current = new StringBuilder();
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
        int len = 0;
        try {
            while (true) {
                word.charAt(len++);
            }
        } catch (Exception ignored) {}
        return len;
    }

    public static int[] findMinMax(String[] words) {
        int min = stringLength(words[0]), max = min;
        int minIdx = 0, maxIdx = 0;

        for (int i = 1; i < words.length; i++) {
            int len = stringLength(words[i]);
            if (len < min) {
                min = len;
                minIdx = i;
            }
            if (len > max) {
                max = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        int[] minMax = findMinMax(words);

        System.out.println("Shortest Word: " + words[minMax[0]]);
        System.out.println("Longest Word: " + words[minMax[1]]);
    }
}
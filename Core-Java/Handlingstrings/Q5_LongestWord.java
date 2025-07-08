import java.util.Scanner;
public class Q5_LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest Word: " + longest);
        sc.close();
    }
}
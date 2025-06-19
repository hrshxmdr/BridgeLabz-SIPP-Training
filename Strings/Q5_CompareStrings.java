import java.util.Scanner;

public class Q5_CompareStrings {

    public static boolean manualCompare(String a, String b) {
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

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean manualResult = manualCompare(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Manual comparison result:  " + manualResult);
        System.out.println("Built-in equals() result:   " + builtInResult);
    }
}
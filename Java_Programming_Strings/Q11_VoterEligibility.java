import java.util.Scanner;
import java.util.Random;

public class Q11_VoterEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(100); 
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) results[i][1] = "Cannot Vote";
            else if (ages[i] >= 18) results[i][1] = "Can Vote";
            else results[i][1] = "Cannot Vote";
        }
        return results;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tEligibility");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibility = checkEligibility(ages);
        displayTable(eligibility);
    }
}
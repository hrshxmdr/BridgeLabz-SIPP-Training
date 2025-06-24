import java.util.Scanner;

public class Q30_lp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        
        if (year < 1582) {
            System.out.println("Year must be >= 1582.");
            return;
        }
        
        if (year % 4 != 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
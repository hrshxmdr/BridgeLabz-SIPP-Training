import java.util.Scanner;

public class Q28_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Amar's age:");
        int amarAge = scanner.nextInt();
        System.out.println("Enter Amar's height:");
        double amarHeight = scanner.nextDouble();
        
        System.out.println("Enter Akbar's age:");
        int akbarAge = scanner.nextInt();
        System.out.println("Enter Akbar's height:");
        double akbarHeight = scanner.nextDouble();
        
        System.out.println("Enter Anthony's age:");
        int anthonyAge = scanner.nextInt();
        System.out.println("Enter Anthony's height:");
        double anthonyHeight = scanner.nextDouble();
        
        // Find youngest
        String youngest = "Amar";
        int minAge = amarAge;
        
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }
        
        // Find tallest
        String tallest = "Amar";
        double maxHeight = amarHeight;
        
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }
        
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }
}
import java.util.Scanner;

public class Q10_ArrayIndexDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Accessing index: " + index);
        System.out.println("Value: " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Value: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amit", "Sneha", "Ravi", "Priya"};
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        try {
            generateException(names, index);
        } catch (Exception e) {
            System.out.println("Exception during generateException: " + e.getMessage());
        }

        handleException(names, index);
    }
}
import java.util.Scanner;
public class Q3_CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
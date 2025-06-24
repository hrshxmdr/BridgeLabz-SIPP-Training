import java.util.Random;
import java.util.Scanner;

public class Q5_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100, guess, feedback;
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        do {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (1: Too Low, 2: Too High, 3: Correct)");
            feedback = getUserFeedback(scanner);
            if (feedback == 1) {
                low = guess + 1;
            } else if (feedback == 2) {
                high = guess - 1;
            }
        } while (feedback != 3);
        System.out.println("Yay! I guessed your number: " + guess);
    }

    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    static int getUserFeedback(Scanner scanner) {
        int feedback;
        do {
            feedback = scanner.nextInt();
        } while (feedback < 1 || feedback > 3);
        return feedback;
    }
} 
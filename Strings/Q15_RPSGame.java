import java.util.*;

public class Q15_RPSGame {

    public static String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        return switch (rand) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock")))
            return "Player";
        else return "Computer";
    }

    public static void showResults(String[][] results, int userWins, int compWins) {
        System.out.println("Game\tPlayer\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        int total = userWins + compWins + (results.length - userWins - compWins);
        System.out.println("\nPlayer Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.printf("Player Win %%: %.2f%%\n", 100.0 * userWins / total);
        System.out.printf("Computer Win %%: %.2f%%\n", 100.0 * compWins / total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games to play? ");
        int games = sc.nextInt();
        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter rock, paper or scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            if (winner.equals("Player")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            results[i] = new String[]{user, comp, winner};
        }

        showResults(results, userWins, compWins);
    }
}
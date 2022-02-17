import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monopoly {
    private Monopoly game;
    static List<Player> players = new ArrayList<>();

    public static void main(String[] args) {
	// take in player names, then start game, roll to position, and end game when player takes 50 turns
        System.out.println("Monopoly: Fast-Dealing Property Trading Game");
        CreatePlayers();
        playerInformation();

    }



    public static void CreatePlayers() {
        // Ask how many players
        System.out.println("How many players? ");
        try {
            int integerInput = Integer.parseInt(Input.takeInput());
            // Create list of players with that number
            List<Player> players = createListOfPlayers(integerInput);
        } catch (NumberFormatException e) {
            System.out.println("Enter valid number");
            System.exit(1);
        }
    }

    public static List<Player> createListOfPlayers(int numberOfPlayers) {

        if (numberOfPlayers < 2 || numberOfPlayers > 5) {
            System.out.println("Between 2 and 5 players please.");
        } else {
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Player " + (i + 1) + " is called: ");
                players.add(new Player(Input.takeInput()));
            }
        } return players;
    }

    public static void playerInformation() {
        // count has to be set to one
        int playerCount = 1;
        for (Player player : players) {
            System.out.println("===================");
            System.out.println("Player " + playerCount++);
            System.out.println("Name: " + player.getName());
            System.out.println("Cash: " + player.getCash());
            System.out.println("Position: " + player.getPosition());
            System.out.println("===================");
        }
    }
}

import java.util.*;

public class Monopoly {
    private Monopoly game;
    static List<Player> players = new ArrayList<>();
    static Dice dice = new Dice();

    private static final String BUY_PROPERTY = "Buy property";
    private static final String SELL_PROPERTY = "Sell property";
    private static final String EXIT_GAME = "Exit";
    private static final String[] PLAYER_OPTIONS = { BUY_PROPERTY, SELL_PROPERTY, EXIT_GAME};

    private static Options options;

    public Monopoly(Options options) {
        this.options = options;
    }

    public Monopoly() {

    }

    public void run() {
        // take in player names, then start game, roll to position, and end game when player takes 50 turns
        System.out.println("Monopoly: Fast-Dealing Property Trading Game");
        CreatePlayers();
        playerInformation();
        System.out.println("It's time to play!");
        Turn(players);
    }

    public static void main(String[] args) {
        Options options = new Options(System.in, System.out);
        Monopoly game = new Monopoly(options);

        game.run();

    }



    public void Turn(List<Player> players) {
        int rollValue = 0;
        while (true) {
            for (Player player : players) {
                System.out.println(player.getName() + "'s turn!");
                rollValue = dice.rollDice();
                System.out.println("You rolled a " + rollValue + " and landed on..");

            String choice = (String) options.getChoiceFromOptions(PLAYER_OPTIONS);

            if (choice.equals(BUY_PROPERTY)) {
                // display vending machine items
                System.out.println("Let's buy something!");;
            } else if (choice.equals(SELL_PROPERTY)) {
                // do purchase
                System.out.println("Let's sell something!");
            } else if (choice.equals(EXIT_GAME)) {
                // exit
                System.out.println("Thank you let's play again");

            }
        }

        }
    }

    public void CreatePlayers() {
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

    public List<Player> createListOfPlayers(int numberOfPlayers) {

        if (numberOfPlayers < 2 || numberOfPlayers > 5) {
            System.out.println("Between 2 and 5 players please.");
            CreatePlayers();
        } else {
            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.println("Player " + (i + 1) + " is called: ");
                players.add(new Player(Input.takeInput()));
            }
        }
        System.out.println("Let's see who goes first");
        boolean tie = true;
        boolean[] ties = new boolean[players.size()];
        for (int i = 0; i < players.size(); i++)
            ties[i] = true;
        int first = -1;
        int[] order = new int[players.size()];

        // roll first, order array holds the roll values
        while (tie) {
            for (int i = 0; i < players.size(); i++) {
                if (ties[i])
                    order[i] = dice.rollDice();
            }

            int maxRoll = 0;
        // checks for tie
            for (int i = 0; i < players.size(); i++) {
                if (ties[i]) {
                    if (order[i] > maxRoll) {
                        maxRoll = order[i];
                        first = i;
                    }
                }
            }
            // makes sure ties are false
            tie = false;
            for (int i = 0; i < players.size(); i++)
                ties[i] = false;
            // checks for equal values
            for (int i = 0; i < players.size(); i++) {
                if (order[i] == maxRoll && i != first) {
                    ties[i] = true;
                    tie = true;
                }
            }
        }
        // depending on who got the bigger roll, this would make them replace the first player
        for (int i = 0; i < first; i++)
            this.players.add(players.remove(i));

        return players;
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

import java.util.Random;

public class Dice {
    // two dice, conditions if they both match
    private int dice1;
    private int dice2;

    public int rollDice() {
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        // for option to roll again
        boolean diceAreDouble = (dice1 == dice2);

        int totalRoll = dice1 + dice2;

        return totalRoll;
    }
}

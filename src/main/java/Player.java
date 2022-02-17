import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int cash;
    private int position;

    private String properties;

    // create array, player buys and owns property, rents it, pays taxes, builds
    // player moves spaces, falls into jail, but also makes choices, will have to make input possible


    public Player(String name) {
        this.name = name;
        this.cash = 1500;
        this.position = 0;
    }

    // methods

    // getters and setters

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public int getPosition() {
        return position;
    }
}

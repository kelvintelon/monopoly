public class Square {
    // add in specific values for each square
    public String name;
    public int position;
    public int cost;

    public Square(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Square(String name, int position, int cost) {
        this.name = name;
        this.position = position;
        this.cost = cost;
    }

    public Square() {

    }

    public String getName() {
        return this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public Square boardSquare(int pos) {
        switch (pos) {
            case 0:
                return go(pos);
            case 1:
                return mediterranean(pos);
            case 2:
                return community(pos);
            case 3:
                return baltic(pos);
            case 4:
                return income(pos);
            case 5:
                return reading(pos);
            case 6:
                return oriental(pos);
            case 7:
                return chance(pos);
            case 8:
                return vermont(pos);
            case 9:
                return connecticut(pos);
            case 10:
                return visiting(pos);
            case 11:
                return charles(pos);
            case 12:
                return electric(pos);
            case 13:
                return states(pos);
            case 14:
                return virginia(pos);
            case 15:
                return pennsylvaniaRR(pos);
            case 16:
                return james(pos);
            case 17:
                return community(pos);
            case 18:
                return tennessee(pos);
            case 19:
                return newYork(pos);
            case 20:
                return parking(pos);
            case 21:
                return kentucky(pos);
            case 22:
                return chance(pos);
            case 23:
                return indiana(pos);
            case 24:
                return illinois(pos);
            case 25:
                return bAndO(pos);
            case 26:
                return atlantic(pos);
            case 27:
                return ventor(pos);
            case 28:
                return water(pos);
            case 29:
                return marvin(pos);
            case 30:
                return toJail(pos);
            case 31:
                return pacific(pos);
            case 32:
                return carolina(pos);
            case 33:
                return community(pos);
            case 34:
                return pennsylvaniaAve(pos);
            case 35:
                return shortLine(pos);
            case 36:
                return chance(pos);
            case 37:
                return park(pos);
            case 38:
                return luxury(pos);
            case 39:
                return boardwalk(pos);
            case 40:
                return jail(pos);
            default:
                return null;
        }
    }

    private Square go(int pos) {
        return new Square("Go", pos);
    }

    private Square mediterranean(int pos) {
        int cost = 60;
        return new Square("Mediterranean Avenue", pos, cost);
    }

    private Square community(int pos) {
        return new Square("Community Chest", pos);
    }

    private Square baltic(int pos) {
        int cost = 60;
        return new Square("Baltic Avenue", pos, cost);
    }

    private Square luxury(int pos) {
        return new Square("luxury", pos);
    }

    private Square income(int pos) {
        int cost = 200;
        return new Square("income",pos, cost);
    }

    private Square reading(int pos) {
        return new Square("Reading Railroad", pos, cost);
    }

    private Square oriental(int pos) {
        int cost = 100;
        return new Square("Oriental Avenue", pos, cost);
    }

    private Square shortLine(int pos) {
        return new Square("Short Line", pos);
    }

    private Square toJail(int pos) {
        return new Square("Go to Jail", pos, cost);
    }

    private Square water(int pos) {
        int cost = 150;
        return new Square("Water Works", pos, cost);
    }

    private Square bAndO(int pos) {
        return new Square("B & O Railroad", pos, cost);
    }

    private Square pennsylvaniaRR(int pos) {
        return new Square("Pennsylvania Railroad", pos, cost);
    }

    private Square electric(int pos) {
        return new Square("Electric Company", pos, cost);
    }

    private Square visiting(int pos) {
        return new Square("Just Visiting", pos, cost);
    }

    private Square jail(int pos) {
        return new Square("In Jail", pos);
    }

    private Square chance(int pos) {
        return new Square("Chance", pos);
    }


    private Square vermont(int pos) {
        int cost = 100;
        return new Square("Vermont Avenue", pos, cost);
    }

    private Square connecticut(int pos) {
        int cost = 120;
        return new Square("Connecticut Avenue", pos, cost);
    }

    private Square charles(int pos) {
        int cost = 140;
        return new Square("St. Charles Place", pos, cost);
    }

    private Square states(int pos) {
        int cost = 140;
        return new Square("States Avenue", pos, cost);
    }

    private Square virginia(int pos) {
        int cost = 160;
        return new Square("Virginia Avenue", pos, cost);
    }

    private Square james(int pos) {
        int cost = 180;
        return new Square("St. James Place", pos, cost);
    }

    private Square tennessee(int pos) {
        int cost = 180;
        return new Square("Tennessee Avenue", pos, cost);
    }

    private Square newYork(int pos) {
        int cost = 200;
        return new Square("New York Avenue", pos, cost);
    }

    private Square kentucky(int pos) {
        int cost = 220;
        return new Square("Kentucky Avenue", pos, cost);
    }

    private Square indiana(int pos) {
        int cost = 220;
        return new Square("Indiana Avenue", pos, cost);
    }

    private Square illinois(int pos) {
        int cost = 240;
        return new Square("Illinois Avenue", pos, cost);
    }

    private Square atlantic(int pos) {
        int cost = 260;
        return new Square("Atlantic Avenue", pos, cost);
    }

    private Square ventor(int pos) {
        int cost = 260;
        return new Square("Ventor Avenue", pos, cost);
    }

    private Square marvin(int pos) {
        int cost = 280;
        return new Square("Marvin Gardens", pos, cost);
    }

    private Square pacific(int pos) {
        int cost = 300;
        return new Square("Pacific Avenue", pos, cost);
    }

    private Square carolina(int pos) {
        int cost = 300;
        return new Square("North Carolina Avenue", pos, cost);
    }

    private Square pennsylvaniaAve(int pos) {
        int cost = 320;
        return new Square("Pennsylvania Avenue", pos, cost);
    }

    private Square park(int pos) {
        int cost = 350;
        return new Square("Park Place", pos, cost);
    }

    private Square boardwalk(int pos) {
        int cost = 400;
        return new Square("Boardwalk", pos, cost);
    }

    private Square parking(int pos) {
        return new Square("Free Parking", pos);
    }
}

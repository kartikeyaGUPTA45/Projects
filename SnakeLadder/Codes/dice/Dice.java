package dice;

public class Dice {
    int MIN = 1;
    int MAX = 6;

    public int diceRoll() {
        double d = (Math.random() * (MAX)) + MIN;
        return (int)d;
    }

 }

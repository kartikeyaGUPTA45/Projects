import coordinates.Coordinates;
import jumper.Jumper;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Player p1 = new Player();
        // p1.setPlayerDetailsFromUserInput(p1);
        // Player p2 = new Player();
        // p2.setPlayerDetailsFromUserInput(p2);

        // System.out.println("Player name: " + p1.getPlayerName());
        // System.out.println("Player name: " + p2.getPlayerName());

        // Dice dice = new Dice();

        // System.out.println(dice.diceRoll());

        Coordinates c = new Coordinates(8, 7);
        Coordinates d = new Coordinates(6, 7);
        // System.out.println(c.printCoordinates());

        Jumper j = new Jumper(c, d);
        System.out.println(j.getJumperName());

    }
    
}

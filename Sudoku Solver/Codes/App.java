import board.QueenBoard;
import game.NQueenGame;

public class App {
    public static void main(String[] args) throws Exception {
    
        
        QueenBoard b = new QueenBoard(3);
        NQueenGame game = new NQueenGame(b);

        game.play();

    }
}

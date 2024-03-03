import board.Board;
import java.util.Scanner;
import player.Player;

public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      System.out.println("First Project -> Tic Tac Toe");

      new Board(4, '-');

      Scanner scn = new Scanner(System.in);
      String name = scn.nextLine();
      char symbol = scn.nextLine().charAt(0);

      Player p1 = new Player();
      p1.setPlayerNameAndSymbol(name, symbol);
      p1.getPlayerNameAndSymbol();
      
      Player p2 = new Player();
      p2.setPlayerNameAndSymbol("Akash", 'O');
      p2.getPlayerNameAndSymbol();
   }
}

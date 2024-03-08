import board.Board;
import game.Game;
import player.Player;

public class App {
   public static void main(String[] args) throws Exception {
      System.out.println("First Project -> Tic Tac Toe");

      Board b = new Board(3, '-');
    //   b.printBoardConfig();

    //   Scanner scn = new Scanner(System.in);
    //   System.out.print("Please enter the name of Player: ");
    //   String name = scn.nextLine();
    //   System.out.print("Please  enter the symbol of Player: ");
    //   char symbol = scn.nextLine().charAt(0);

      Player p1 = new Player();
      p1.setPlayerNameAndSymbol("Ravi", 'X');
      p1.getPlayerNameAndSymbol();

      Player p2 = new Player();
      p2.setPlayerNameAndSymbol("Akash", 'O');
      p2.getPlayerNameAndSymbol();

      Game game  = new Game(new Player[] {p1, p2}, b);
      game.play();

   }
}

/**
 *
 * @author Maury
 */

import java.util.Scanner;
public class solution {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        System.out.println(board.display());

        System.out.print("Enter a move: ");
        String line = sc.nextLine();
        
        while(!line.equals("quit")) {
            if(line.length() < 5)
            {    
                System.out.println("Insufficient number of commands. The"
                        + " board reads");
            }
            else
            {
                String result = 
                    board.exchangeCharacters(line.substring(0, 2),
                    line.substring(3, 5));
            System.out.println(result + " The board reads:");
            }
            System.out.println(board.display());
            System.out.print("Enter a move: ");
            line = sc.nextLine();
        }
    }
}

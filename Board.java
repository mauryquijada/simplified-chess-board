/**
 *
 * @author Maury
 */
public class Board {
    
    /*
     * Following is the multidimensional array that defines the board.
    */
    public static Tile [][] board;
    
    /*
     * Following are arrays that define the labels that border the sides
     * of the chess board.
     */
    public int [] verticalLabels = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    public String [] horizontalLabels = {"", "a", "b", "c", "d", "e", "f", "g", "h"};
    
    /*
     * Following is the class constructure, which simply sets the rows of the
     * board to the default contents defined above.
     */
    public Board ()
    {
        board = new Tile [8][8];
        
        board[0] = Tile.backRow();
        board[1] = Tile.frontRow();
        board[2] = Tile.emptyRow();
        board[3] = Tile.emptyRow();
        board[4] = Tile.emptyRow();
        board[5] = Tile.emptyRow();
        board[6] = Tile.frontRow();
        board[7] = Tile.backRow();
        
    }
    
    /*
     * Following is a method that returns the contents of the board as they
     * stand in this instance. They include the vertical and horizontal labels
     * such that the user knows how to select each piece.
     */
    public String display ()
    {
        String boardSoFar = "";
        boardSoFar += "  a b c d e f g h \n";
        for (int i = 0; i < board.length; i++)
        {
            boardSoFar += verticalLabels[i+1] + " ";
            for (int j = 0; j < board[i].length; j++)
            {
                Tile value = board[i][j];
                boardSoFar += value.showValue() + " ";
            }

            boardSoFar += "\n";
        }
        
       return boardSoFar;
    }
    
    /*
     * Following is a method that exchanges the two coordinates input by the
     * user.
     */
    public String exchangeCharacters (String coordinate1, String coordinate2) 
    {
        int firstHoriz = Integer.decode(coordinate1.substring(0, 1)) - 1;
        int secondHoriz = Integer.decode(coordinate2.substring(0, 1)) - 1;
        
        if (firstHoriz < 0 || firstHoriz < 0 || firstHoriz > 8 ||
                secondHoriz > 8)
            return "Error. Horizontal Coordinates are not valid. ";
                
        int firstVert = -1;
        int secondVert = -1;
        
        for(int i = 0; i < 8; i++)
        {
            if (coordinate1.substring(1, 2).equals(horizontalLabels[i+1]))
            {
                firstVert = i;
            }
            
            if (coordinate2.substring(1, 2).equals(horizontalLabels[i+1]))
            {
                secondVert = i;
            }
        }
        
        if (firstVert < 0 || secondVert < 0)
            return "Error. Vertical coordinates are not valid. ";
        
        String piece1Value = board[firstHoriz][firstVert].showValue();
        String piece2Value = board[secondHoriz][secondVert].showValue();
        String temp = piece1Value;
        
        board[firstHoriz][firstVert].changeValue(piece2Value);
        board[secondHoriz][secondVert].changeValue(temp);
        
        return "Success!";
        
    }
}

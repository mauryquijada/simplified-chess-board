/**
 *
 * @author Maury
 */
public class Tile {
    
    /*
     * Following is a variable that stores the value of the piece as displayed
     * on the board.
     */
    public String type;
    
    public static Tile [] backRow ()
    {
        Tile [] returned = {new Tile("R"), new Tile("N"),
        new Tile("B"), new Tile("K"), new Tile("Q"),
        new Tile("B"), new Tile("N"), new Tile("R")};
        
        return returned;
    }
    
    public static Tile [] frontRow ()
    {
        Tile [] returned = {new Tile("P"), new Tile("P"),
        new Tile("P"), new Tile("P"), new Tile("P"), 
        new Tile("P"), new Tile("P"), new Tile("P")};
        
        return returned;
    }
    
    public static Tile [] emptyRow ()
    {
        Tile [] returned = {new Tile("-"), new Tile("-"),
        new Tile("-"), new Tile("-"), new Tile("-"), 
        new Tile("-"), new Tile("-"), new Tile("-")};
        
        return returned;
    }
    
    /*
     * Following is a class constructor that simply assigns the position the value
     * that the constructor asks for.
     */
    public Tile (String typeOfPiece)
    {
        type = typeOfPiece;
    }
    
    /*
     * Following is a method that simply returns the value of the position.
     */
    public String showValue ()
    {
        return type;
    }
    
    /*
     * Following is a method that simply re-assigns the value of the position
     * to the piece input into the method.
     */
    public void changeValue (String typeOfPiece)
    {
        type = typeOfPiece;
    }


    
}

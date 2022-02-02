package Tiles;
public class tiles {
    public int[] currentTile;
    public int[] lastTile;
    public boolean containsTile;

    /**
     * Tracks down all the tiles in the game
     */
    public  tiles(){
        currentTile = new int[3];
        lastTile = new int[3];
        containsTile = true;
    }
}

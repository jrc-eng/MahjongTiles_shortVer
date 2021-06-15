/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong_136;

/**
 * Tile
 * 
 * Class for Mahjong tiles.
 * 
 * Contains SUIT and RANK as values.
 * 
 */
public class Tile {
    private TileSuit suit;
    private int rank;
    
    public Tile(TileSuit s, int r)
    {
        suit = s;
        rank = r;
    }
    
    /*
        Getters and Setters for Suit and Rank
    */
    public int getRank()
    {
        return rank;
    }
    public void setRank(int r)
    {
        rank = r;
    }
    
    public TileSuit getSuit()
    {
        return suit;
    }
    public void setSuit(TileSuit s)
    {
        suit = s;
    }
    
    /**
     * isSimple()
     * 
     * BAMs, PANs, and CHARAs are simple tiles.
     * 
     * @return 
     */
    public boolean isSimple()
    {
        return (suit == TileSuit.BAM || suit == TileSuit.PAN || suit == TileSuit.CHARA);
    }
    
    /**
     * isRoyal()
     * 
     * If the tile is NOT a suited tile with rank, it is a Royal Tile.
     * 
     * @return 
     */
    public boolean isRoyal()
    {
        return !(suit == TileSuit.BAM || suit == TileSuit.PAN || suit == TileSuit.CHARA);
    }
    
    
}

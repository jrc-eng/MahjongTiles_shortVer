/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong_shortVer;

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
    
    
}

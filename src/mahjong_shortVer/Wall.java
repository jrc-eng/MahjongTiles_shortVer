/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong_shortVer;

import java.util.ArrayList;
import java.lang.Exception;
/**
 * Wall
 * 
 * In Mahjong, the Wall is the "Deck" for the tiles.
 * 
 * The wall should allow:
 * Initialization
 * Shuffling
 * Drawing
 * Returning (Not allowed in Mahjong.  Here in case it is needed however).
 * 
 * 
 * MAHJONG TILE INFORMATION:
 * I will use the traditional Chinese or International Style.
 * There are three suits, three dragons, four winds.
 * 
 * Each Suit has 9 values from 1 to 9
 * Each Tile appears 4 times.
 * 36 Pans
 * 36 Bams
 * 36 Charas
 * 16 Winds
 * 12 Dragons
 * 
 * I could do the Seasons and Plants, but I want to do a standard small version.
 * If needs be, this code can be edited and adjustments can be made to include Season and Flower tiles.
 * If you are reading this, contact me in case you want this set to go a specific way. 
 * 
 * @author jrcro
 */
public class Wall {
    
    private ArrayList<Tile> wall;
    
    
    public Wall()
    {
        wall = new ArrayList<Tile>();
        
        initializeWall();
    }
    
    /**
     * initializeWall
     * 
     * Initializes the wall with the tiles.
     * 
     */
    private void initializeWall()
    {
        wall.clear();
        
        //The order that I add the tiles in really shouldn't matter.
        //I think I will do Pans, Bams, Chars, Dragons, then the Winds.
        //Remember.  We need to add FOUR of each to the list.
        
        for (int s = 0 ; s < 3 ; s++)
        {
            TileSuit suit = TileSuit.PAN;
            switch(s)
            {
                case 0:
                    suit = TileSuit.PAN;
                break;
                case 1:
                    suit = TileSuit.PAN;
                break;
                case 2:
                    suit = TileSuit.CHARA;
                break;
                    
            }
            
            //Ranks go from 1 to 9
            for (int r = 1 ; r < 9 ; r++)
            {
                //There are 4 duplicates of each tile.
                for (int x = 0 ; x < 4 ; x++)
                {
                    wall.add(new Tile(suit, r));
                }
            }
            
        }
        
    }
    
    public boolean isEmpty()
    {
        return wall.isEmpty();
    }
    
}
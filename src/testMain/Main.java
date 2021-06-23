/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMain;

import mahjong_136.Tile;
import mahjong_136.Wall;

/**
 *
 * @author jrcro
 */
public class Main {
    
    
    public static void main(String [] args)
    {
        Wall w = new Wall();
        
        
        Tile t = w.draw();
        
        System.out.println(t);
        
        
        
    }
}

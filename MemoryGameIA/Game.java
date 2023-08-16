import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
import java.util.Random;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    public static int highScore = 0;
    public static int Score = 0;
    int x = 1000;
    int y = 700;
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000,700, 1); 
        Random rand = new Random();
        
        
        
        Warrior w1 = new Warrior();
        this.addObject(w1,25,375);
        
        for ( int i = 0; i <= 20; i++)
        {
        int randX1 = rand.nextInt(x);
        int randY1 = rand.nextInt(y);

            addObject(new Bomb(),randX1, randY1);
        } 
        for ( int i = 0; i <= 8; i++)
        {
        int randX1 = rand.nextInt(x);
        int randY1 = rand.nextInt(y);

            addObject(new Coin(),randX1, randY1);
        } 
        addObject(new WinningArea(),999, 500);
        
        
        
    }
    public void act()
    {
        showText("Score: " + Game.highScore,900,50);
        //gridlines();
    }
        
    
    /*public void gridlines()
    {
        int fx = 0;
        int fy = 0;
        for(int q = 0; q<14; q++)
        {
            for(int p = 0; p<20; p++)
            {
                addObject(new gridbox(), fx,fy);
                fx = fx+100;
            }
            fx = fx-(100*(20));
            fy = fy+100;
        }
    
    }
    */
}

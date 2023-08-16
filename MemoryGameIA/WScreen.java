import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WScreen extends World
{

    /**
     * Constructor for objects of class WScreen.
     * 
     */
    public WScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        playagainButton PB2 = new playagainButton();
        this.addObject(PB2,500,400);
        
        quitButton QB1 = new quitButton();
        this.addObject(QB1,500,500);
        
        //System.out.println("Score:" + scoreCount);
        showText("Total Score: " + Game.highScore,500,50);
    }
}

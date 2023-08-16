import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinningArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinningArea extends Actor
{
    
    public void act()
    {
        int size = 30;
        GreenfootImage WinningArea = new GreenfootImage(25,1000);
        WinningArea.setColor(Color.RED);
        WinningArea.fillRect(0,0,1000,1000);
        setImage(WinningArea);
        getImage().setTransparency(0);
    }
}

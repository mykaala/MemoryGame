import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.String;
/**
 * Write a description of class Warrior here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warrior extends Actor
{
    /**
     * Act - do whatever the Warrior wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean pressed = false;
    int moveby = 50;
    public Warrior()
    {
        int size = 30;
        GreenfootImage warrior = new GreenfootImage(size,size);
        warrior.setColor(Color.BLUE);
        warrior.fillOval(0,0,size,size);
        setImage(warrior);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("left") && !pressed)
    {
        pressed = true;
        setLocation(getX()-moveby, getY());
        Greenfoot.delay(10);
    }
        if (!Greenfoot.isKeyDown("left") && pressed)
        {
           pressed = false; 
        }
    if (Greenfoot.isKeyDown("right") && !pressed)
    {
        setLocation(getX()+moveby, getY());
        pressed = true;
        Greenfoot.delay(10);
    }
        if (!Greenfoot.isKeyDown("right") && pressed)
        {
           pressed = false; 
        }
    if (Greenfoot.isKeyDown("up") && !pressed)
    {
        setLocation(getX(), getY()-moveby);
        pressed = true;
        Greenfoot.delay(10);
    }
        if (!Greenfoot.isKeyDown("up") && pressed)
        {
           pressed = false; 
        }
    if (Greenfoot.isKeyDown("down") && !pressed)
    {
        setLocation(getX(), getY()+moveby);
        pressed = true;
        Greenfoot.delay(10);
    }
        if (!Greenfoot.isKeyDown("down") && pressed)
        {
           pressed = false; 
        }
    if (this.isTouching(Bomb.class))
    {
        Game.highScore = 0;
        Greenfoot.setWorld(new LScreen());
    }
    if (this.isTouching(WinningArea.class))
    {
        Greenfoot.setWorld(new WScreen());
    }
}
}

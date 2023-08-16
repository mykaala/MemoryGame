import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Coin extends Actor
{
    //public Game findScore;
    public Coin()
    {
        //findScore = (Game)this.getWorld();
        //findScore.highScore = findScore.highScore + 50;
    }
    public void act()
    {
        GreenfootImage Coin = new GreenfootImage(40,40);
        Coin.setColor(Color.YELLOW);
        Coin.fillRect(0,0,1000,1000);
        setImage(Coin);
       //getImage().setTransparency(0);
        if (this.isTouching(Warrior.class))
        {
            getImage().setTransparency(200);
            Game.highScore = Game.highScore + 50;
            Game.Score = Game.highScore;
            //Greenfoot.delay(10);
            getWorld().removeObject(this);

        }
    }
    
}

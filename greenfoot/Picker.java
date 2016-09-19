import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * These are pickers who will pick gumball for you. There are two pickers, one is a random picker who picks different color gumball randomly.
 * The other one is a green picker who just pick the green gumball. This is an abstract class
 * 
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public abstract class Picker extends Alien
{
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    abstract void giveGumBall();
    
    public void act() 
    {
        // Add your action code here.
    }    
}

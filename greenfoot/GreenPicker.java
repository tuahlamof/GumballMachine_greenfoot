import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Green Picker always picks the green ball
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void giveGumBall() {
        moveTo(MACHINE_X, MACHINE_Y);
        Greenfoot.delay(20);
        sendMessage("You got a green gumball");
        World world = getWorld();
        world.addObject(new GreenGumball(), 450, 450);
        Greenfoot.delay(20);
        moveTo(640, 500);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}

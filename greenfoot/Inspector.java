import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The inspector will check the coin and feed back with whether the payment is ok.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean checkTheCoin(boolean real, int val) {
        this.moveTo(MACHINE_X, MACHINE_Y);
        Greenfoot.delay(20);
        this.moveTo(640, 300);
        
        if (real && val == 25) {
            return true;
        } else {
            if (!real) {
                sendMessage("This is a fake quarter");
            } else {
                sendMessage("Not enough.");
            }
            return false;
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

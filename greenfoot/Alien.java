import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;  

/**
 * These are aliens who pick the gumball
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Alien extends Actor
{
    int MACHINE_X = 460;
    int MACHINE_Y = 300;
    
    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }
    
    public void moveTo(int x, int y) {
        this.setLocation(x, y);
    }
    
    public void sendMessage(String str) {
        World world = this.getWorld();
        List<Messages> theMessage = world.getObjects(Messages.class);
        theMessage.get(0).setMessage(str);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Message that will show the state of the gumball machine
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Messages extends Actor
{
    /**
     * Act - do whatever the Messages wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image;
    public Messages() {
        image = getImage() ;
        image.scale( 400, 25 ) ;
    }
    public void act() 
    {
    }
    public void setMessage(String str) {
        image.clear();
        image.setColor(java.awt.Color.YELLOW) ;
        image.fill();
        image.setColor(java.awt.Color.BLACK);
        image.drawString(str, 10, 20);                    
    }
}

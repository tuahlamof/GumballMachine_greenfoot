import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the tag, showing the role of the aliens.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Tag extends Actor
{
    /**
     * Act - do whatever the Tag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tag(String str) {
        GreenfootImage image = getImage() ;
        image.scale( 90, 25 ) ;
        
        image.setColor(java.awt.Color.BLACK);
        image.drawString(str, 0, 10); 
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

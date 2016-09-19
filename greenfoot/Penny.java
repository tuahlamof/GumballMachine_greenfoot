import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the penny.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Penny extends Coin
{   

    public Penny()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ;
        isReal = true;
        value = 1;
    }
    
}

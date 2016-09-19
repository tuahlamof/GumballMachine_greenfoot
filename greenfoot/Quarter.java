import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the quarter, including real quarter and the fake quarter.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Quarter extends Coin
{

    public Quarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 80, 80 ) ; 
        isReal = true;
        value = 25;
    }
  
}

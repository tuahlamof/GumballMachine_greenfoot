import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the fake quarter.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class FakeQuarter extends Quarter
{
    public FakeQuarter()
    {
        GreenfootImage image = getImage() ;
        image.scale( 75, 75 ) ; 
        isReal = false;
        value = 25;
    }
}

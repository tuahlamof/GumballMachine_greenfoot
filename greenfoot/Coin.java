import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class stands for the coins.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class Coin extends Actor
{
    boolean isReal;
    int value;
    
    public boolean isReal() {
        return this.isReal;
    }
    
    public int getValue() {
        return this.value;
    }
    
    
    public void act() 
    {
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
        } 
    }    
}

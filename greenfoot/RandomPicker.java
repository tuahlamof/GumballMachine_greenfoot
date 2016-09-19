import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This Random Picker pick the gumball randomly
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void giveGumBall() {
        int flag = Greenfoot.getRandomNumber(3);
        moveTo(MACHINE_X, MACHINE_Y);
        Greenfoot.delay(20);
        World world = getWorld();
        if (flag == 0) {
            sendMessage("You got a red gumball");
            world.addObject(new RedGumball(), 450, 450);
        } else if (flag == 1) {
            sendMessage("You got a blue gumball");
            world.addObject(new BlueGumball(), 450, 450);
        } else {
            sendMessage("You got a green gumball");
            world.addObject(new GreenGumball(), 450, 450);
        }
        Greenfoot.delay(20);
        moveTo(640, 100);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}

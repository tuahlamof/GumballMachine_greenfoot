import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * This is the GumballMachine. If you insert a coin and click the crank, 
 * An alien inspector will check it. Then the machine will pick randomly 
 * either a GreenPicker or a RandomPicker Alien to serve you.
 * 
 * @author (Huiyu Yang) 
 * @version (9/14/16)
 */
public class GumballMachine extends Actor
{
    boolean hasCoin;
    boolean isReal;
    int value;

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
        hasCoin = false;
        isReal = false;
        value = 0;
    }
    
    private void sendMessage(String str) {
        World world = this.getWorld();
        List<Messages> theMessage = world.getObjects(Messages.class);
        theMessage.get(0).setMessage(str);
    }

    public void act() 
    {
        // Add your action code here.
        Coin coin = (Coin)getOneObjectAtOffset(10, 10, Coin.class);
    
        if (coin != null) {
            if (hasCoin == true) {
                sendMessage("Already have a coin here. Please click the Crank.");
                if (coin instanceof Penny) {
                    coin.setLocation(57, 71);
                } else if (coin instanceof Quarter) {
                    if (coin instanceof FakeQuarter) {
                        coin.setLocation(66, 248);
                    } else {
                        coin.setLocation(68, 156);
                    }
                }
            } else {
                hasCoin = true;
                this.isReal = coin.isReal();
                this.value = coin.getValue();
                sendMessage("Insertion succeed. Please click the Crank.");       
                World world = this.getWorld();
                world.removeObject( coin );
            }
        }
        
        if (Greenfoot.mousePressed(this)) {
            if (hasCoin == false) {
                sendMessage("No coins here.");
            } else {
                if (checkCoin()) {
                    sendMessage("Payment is Ok. Now give the gumball.");
                    Greenfoot.delay(50);
                    Picker picker = selectPicker();
                    picker.giveGumBall();
                    hasCoin = false;
                }
            }
        }
    }
    
    private boolean checkCoin() {
        World world = getWorld();
        List<Inspector> inspectors = world.getObjects(Inspector.class);
        return inspectors.remove(0).checkTheCoin(isReal, value);
    }
    
    
    private Picker selectPicker() {
        int flag = Greenfoot.getRandomNumber(2);
        World world = getWorld();
        if (flag == 1) {
            sendMessage("A GreenPicker is serving you.");
            List<GreenPicker> pickers = world.getObjects(GreenPicker.class);
            return pickers.get(0);
        } else {
            sendMessage("A RandomPicker is serving you.");
            List<RandomPicker> pickers = world.getObjects(RandomPicker.class);
            return pickers.get(0);
        }
    }
}

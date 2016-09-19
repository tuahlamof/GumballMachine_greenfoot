import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the GumballWorld, where you can get served by an alien and get a gumball
 * 
 * @author (yHuiyu Yang) 
 * @version (9/14/16)
 */
public class GumballWorld extends World
{

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 311, 250);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;
        
      
        

        Inspector inspector = new Inspector();
        addObject(inspector, 640, 300);
        addObject(new Tag("Inspector"), 745, 300);
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 640, 100);
        addObject(new Tag("Random Picker"), 740, 100);
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 640, 500);
        addObject(new Tag("Green Picker"), 745, 500);
        
        Messages message = new Messages();
        addObject(message, 240, 550);
        
    }
}

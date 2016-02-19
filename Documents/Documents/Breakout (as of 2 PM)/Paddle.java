import greenfoot.*;

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.isKeyDown("right") == true) {
           move (4);
        }
        if (Greenfoot.isKeyDown("left") == true){
           move (-4);
        }
        }
    }    


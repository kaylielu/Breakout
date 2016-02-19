import greenfoot.*;
import java.awt.Font;

/**
 * Write a description of class Notifications here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notifications extends Actor
{
   /**
    * Constructor that accepts a String parameter to create a String image
    */
    public Notifications (String message){
         GreenfootImage text = new GreenfootImage(message, 90, java.awt.Color.magenta,null);
      text.setFont(new Font("Times New Roman", java.awt.Font.PLAIN, 100));
      setImage(text);
    }
    
    
    /**
     * Act - do whatever the Notifications wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

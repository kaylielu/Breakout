import greenfoot.*;
import java.awt.Font;
/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         GreenfootImage life = new GreenfootImage("Lives:" + Ball.getLives(), 25, java.awt.Color.magenta,null);
      life.setFont(new Font("Times New Roman", java.awt.Font.PLAIN, 20));
      setImage(life);
    }    
    
     public Lives()
    {
        GreenfootImage lives = new GreenfootImage("Lives:" + Ball.getLives(), 25, java.awt.Color.magenta, null);
        lives.setFont(new Font("Times New Roman", java.awt.Font.PLAIN, 20));
        setImage(lives);
         
    }
}

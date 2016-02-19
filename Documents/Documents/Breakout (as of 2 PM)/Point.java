import greenfoot.*;
import java.awt.Font;

/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point extends Actor
{

    /**
     * Act - do whatever the Point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      GreenfootImage pointsCounter = new GreenfootImage("Citizenship Points:" + Ball.getPoints(), 25, java.awt.Color.magenta,null);
      pointsCounter.setFont(new Font("Times New Roman", java.awt.Font.PLAIN, 20));
      setImage(pointsCounter);
     
    }    
    public Point()
    {
        GreenfootImage points = new GreenfootImage("Citizenship Points:" + Ball.getPoints(), 25, java.awt.Color.magenta, null);
        points.setFont(new Font("Times New Roman", java.awt.Font.PLAIN, 20));
        setImage(points);
         
    }
   
}


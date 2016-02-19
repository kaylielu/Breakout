import greenfoot.*;

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
         Ball b = new Ball ();
         Paddle p = new Paddle ();
          Point point = new Point();
          Lives life = new Lives ();
         
        addObject (b,  getWidth()/2, getHeight()- (getHeight()/8)); //adds the ball
        addObject (p, getWidth()/2, getHeight() * 9/10); //adds the paddle
        addObject (point, getWidth()*1/5, getHeight()-14);//adds the point counter 
        addObject (life, getWidth()- (getWidth()*1/12), getHeight()-14);//adds the life counter 
         for (int n = 0; n < 5; n++){
            addObject(new Brick (Greenfoot.getRandomNumber(29)+ ".JPG"), 60 + (120 * n),
            50);
        }
        for (int n = 1; n < 5; n++){
            addObject(new Brick ("" + Greenfoot.getRandomNumber(29)+ ".JPG"), 120 * n,
            135);
        }
        for (int n = 0; n < 5; n++){
            addObject(new Brick ("" + Greenfoot.getRandomNumber(29) +".JPG" ), 60 + (120 * n),
            220);
        }
        for (int n = 1; n < 5; n++){
            addObject(new Brick ("" + Greenfoot.getRandomNumber(29)+ ".JPG"), 120 * n,
            305);
        }
        
        
        }
        public void act(){
          if(getObjects(Brick.class).isEmpty()){
            Greenfoot.playSound("LevelUp.mp3");
            Notifications clear = new Notifications ("Cleared!");
               addObject(clear, getWidth()/2,getHeight()/2);
            Greenfoot.delay(100); 
            removeObject(clear); 
              Greenfoot.setWorld(new Level4());

        }
    }
}

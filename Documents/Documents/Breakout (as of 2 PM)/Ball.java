import greenfoot.*;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    // Initial x and y spped of the ball.
    static int points = 0;
    static int lives = 2;
    String [] Death = {"Awww, try again", "Don't give up!", "Keep on going!", "So Close!", "Almost got it!" };
    int dx = Greenfoot.getRandomNumber(6)-2; //Should vary on each release
       int dy = -2;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
       public void act() 
    {
          
      setLocation (getX() + dx, getY() + dy); 
      bounceWalls();
      bounceObjects();
      removeBrick();
      endGame();
   
      

    } 
    /**
     * Method that makes sure the ball bounces off walls.
     */
    public void bounceWalls (){
        if (isAtEdge()){
          if (getY()== 0 ||getY() == 599){
              dy = -dy;
        } else{
          dx = -dx;
        }
        }
    }
    /**
     * Method that makes sure the ball bounces off objects (bricks, paddle)
     */
    public void bounceObjects (){
         if (isTouching (Paddle.class) == true || isTouching (Brick.class) == true){
            // Makes sure the ball changes velocity depending on how the paddle is moved
             if (isTouching (Paddle.class) == true){ 
                 if (getY() <= 559){
                     setLocation (getX(), getY() - 2);
                    }
                 if(Greenfoot.isKeyDown("left")){
                     if(dx <0){
                         dx --;
                        }
                     else{
                          dx++;
                     }
                 }
                 else if(Greenfoot.isKeyDown("right")){
                    if(dx >0){
                         dx ++;
                        }
                     else{
                          dx--;
                     } 
                 }
                }
             //Accounts for whent the ball is completely vertical; prevents permanent vertical velocity
                if (dx == 0){
                 dx = Greenfoot.getRandomNumber(1)+ 1;
                }
             dy = -dy; //reverses the vertical direction of the ball
             
             //Makes sure the ball does not move too fast
             if (dx > 5){
                 dx = 3;
                }else if (dx < -5){
                    dx = -3;
                }
            }
    }
    
    /**
     * Ends the game when the ball hits the bottom of the screen
     */
    public void endGame(){
        if (getY() >= 599){ //599 is currently the bottom of the map
            if (lives == 2 || lives == 1){
                lives -=1;
               Notifications encouragement = new Notifications (Death[Greenfoot.getRandomNumber(5)] + "\n" + "Lives left: " + lives);
               getWorld().addObject(encouragement, getWorld().getWidth()/2,getWorld().getHeight()/2);
               Greenfoot.delay(300);
               getWorld().removeObject (encouragement);
               setLocation (getWorld().getWidth()/2, getWorld().getHeight()- (getWorld().getHeight()/8));
               setLocation (getX() + dx, getY() + dy); 
            }else
            if (lives == 0){
            Notifications loser = new Notifications ("Game Over");
             getWorld().addObject(loser, getWorld().getWidth()/2,getWorld().getHeight()/2);
             Greenfoot.playSound("YouLose.mp3");
             Greenfoot.stop();
            }
            Lives life = new Lives ();
                life.act();
         
        }
    }
    
    public void removeBrick (){
        if (getOneIntersectingObject(Brick.class) != null){
            removeTouching (null);
            points+=5;
            Greenfoot.playSound("BlockSound.mp3");
            Point p = new Point();
            p.act(); 
     
            
        }
    }
    
    public static int getPoints(){
        return points;
    }
    
    public static int getLives(){
        return lives;
    }
    
    
}

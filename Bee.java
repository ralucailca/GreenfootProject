import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Bug
{    
     int score=0;
     int lives=3;
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        miscare();
        intoarcere();
        catchFlower();
        catchBySpider();
        castig();
    }    
    public void miscare() 
    { 
       if(Greenfoot.isKeyDown("left"))
        {turn(-2);}
       if(Greenfoot.isKeyDown("right"))
         {turn(2);}
       if(atLeftEdge())
       {
           setLocation(getWorld().getWidth()-26,getY());
       }
       else
       if(atRightEdge())
       { 
           setLocation(26,getY());
       }
    }
    public boolean atRightEdge()
    {
        if(getX()>getWorld().getWidth()-20)
         return true;
      else
         return false;
     }
    public boolean atLeftEdge()
    {
        if(getX()<20)
         return true;
      else
         return false;
     }
    private void catchFlower()
    {
        if(isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            score++;
            getWorld().showText("Score : " + score,60,590);
            
        }
    }
   
    private void catchBySpider()
    {
        if(isTouching(Spider.class))
        {   setLocation(20,20);
            lives--;
            getWorld().showText("Lives : " + lives,950,60);
            if(lives<0)
            { 
              Greenfoot.stop();
              getWorld().showText("Game over!",500,300);
            }
        }
    }
    public void castig()
    {   if(score==95)
          {
           Greenfoot.stop();
           getWorld().showText("You won!",500,300);
          }
    }
}

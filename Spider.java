import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Bug
{   
    
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        intoarcere();
        randomMovement();
   
    } 
    private void randomMovement()
    {  move(Greenfoot.getRandomNumber(6));
       if(Greenfoot.getRandomNumber(100)<10)
       {turn(Greenfoot.getRandomNumber(90)-45);}
    }
}

//Created by Hamed Faruqi & Matthew Myles


public class SmashBros
{
    private int percent;                                        //Global variable for percent
    private int damage;                                         //Global variable for amount of base damage 
    private int lives;                                          //Global variable for amount of lives
  
    public int getPercent()                                     //Getter method for percent
    {
        return percent;
    }
    
    public int getDamage()                                      //Getter method for damage
    {
        return damage;
    }
    
    public int getLives()                                       //Getter method for lives
    {
        return lives;
    }
    
    public void setPercent(int newPercent)                      //Setter method for percent
    {
        percent = newPercent;
    }
    
    public void setDamage(int newDamage)                       //Setter method for damage
    {
        damage = newDamage;
    }
    
    public void setLives(int newLives)                        //Setter method for lives
    {
        lives = newLives;
    }
    
    public void tiltAttack(SmashBros targetFighter)          //Method for a tilt attack, base attack all characters can do 
    {
       int currentPercent= targetFighter.getPercent();
       currentPercent= currentPercent + this.getDamage();
       targetFighter.setPercent(currentPercent);
    }
    
}
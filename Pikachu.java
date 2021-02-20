//Created by Matthew Myles & Hamed Faruqi 


import java.util.Random;                                                                //Imports random to use for damage as there are threshholds for unique moves

public class Pikachu extends SmashBros
{
    public Pikachu()                                                        //Constructor for instance of Pikachu
    {
        setPercent(0);
        setDamage(8);
        setLives(3);
    }
    
     public void thunderJolt(SmashBros targetFighter)                      //Method for a thunder jolt attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt((15))+2;               //Increases percent by damage ranging from 2 to 15
        targetFighter.setPercent(targetPercent);
    }
    
    public void skullBash(SmashBros targetFighter)                        //Method for a skull bash attack 
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt((22))+5;             //Increases percent by damage ranging from 5 to 22
        targetFighter.setPercent(targetPercent);
    }
    
    public void thunder(SmashBros targetFighter)                         //Method for a thunder attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt((20))+6;            //Increases percent by damage ranging from 6 to 20
        targetFighter.setPercent(targetPercent);
    }
}

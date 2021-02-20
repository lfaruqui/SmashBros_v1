//Created by Matthew Myles & Hamed Faruqi 


import java.util.Random;                                                            //Imports random to use for damage as there are threshholds for unique moves

public class Yoshi extends SmashBros
{
    public Yoshi()                                                                     //Constructor for instance of Yoshi
    {
        setPercent(0);
        setDamage(9);
        setLives(3);
    }
    
    
    public void eggRoll(SmashBros targetFighter)                                        //Method for egg roll attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt(20)+10;                             //Increases percent by damage ranging from 10 to 20
        targetFighter.setPercent(targetPercent);
    }
    
    public void eggThrow(SmashBros targetFighter)                                      //Method for egg throw attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt(15)+5;                             //Increases percent by damage ranging from 5 to 15
        targetFighter.setPercent(targetPercent);
    }
    
    public void eggBomb(SmashBros targetFighter)                                       //Method for egg bomb attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt(20)+1;                             //Increases percent by damage ranging from 1 to 20
        targetFighter.setPercent(targetPercent);
    }
}

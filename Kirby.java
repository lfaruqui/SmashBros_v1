//Created by Hamed Faruqi & Matthew Myles


import java.util.Random;                                                        //Imports random to use for damage as there are threshholds for unique moves

public class Kirby extends SmashBros
{
    public Kirby()                                                            //Constructor for instance of Kirby
    {
        setPercent(0);
        setDamage(10);
        setLives(3);
    }
    
    public void hammer(SmashBros targetFighter)                              //Method for hammer attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt(35)+15;                  //Increases percent by damage ranging from 15 to 35
        targetFighter.setPercent(targetPercent);
    }
    
    public void stone(SmashBros targetFighter)                                //Method for stone attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt(20)+14;                   //Increases percent by damage ranging from 14 to 20
        targetFighter.setPercent(targetPercent);
    }
    
    public void finalCutter(SmashBros targetFighter)                         //Method for final cutter attack
    {
        int targetPercent= targetFighter.getPercent();
        Random rand= new Random();
        targetPercent= targetPercent + rand.nextInt(10)+1;                   //Increases percent by damage ranging from 1 to 10
        targetFighter.setPercent(targetPercent);
    }
    
}
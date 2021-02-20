//Created by Matthew Myles & Hamed Faruqi 



import java.util.Scanner;

public class TestSmashBros 
{
    
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);                                                             //Creates new scanner
        Kirby playerK = null;                                                                           //Creates "blank", or non-initialized, Kirby object, to be created upon input
        Yoshi playerY = null;                                                                           //Creates "blank", or non-initialized, Yoshi object, to be created from player input 
        Pikachu playerP = null;                                                                         //Creates "blank", or non-initialized,Pikachu object to be created on input
        int maxPercent;                                                                                 //Integer for max percent characters can reach,before losing a life 
        int player1;                                                                                    //Integer for input of first player 
        int player2;                                                                                    //Integer for input of second player
        int input;                                                                                      //Integer for input during the actual game
        
        System.out.println("Please enter max percent for this game: ");                                       //Prompts for max percent
        maxPercent = in.nextInt();
        System.out.println("Player 1, enter a number to choose your character: ");                                //Prompts for character selection
        System.out.println("1. Kirby");  
        System.out.println("2. Yoshi"); 
        System.out.println("3. Pikachu");     
        player1= in.nextInt();
        
        if(player1 == 1)                                                                                //If-else ladder for first player's input 
          playerK = new Kirby();
        else if(player1 == 2)
            playerY= new Yoshi();
        else if(player1 == 3)
            playerP = new Pikachu();
        else
        {
            System.out.println("Please input a correct number");
            player1 = in.nextInt();
        }
         
        System.out.println("Player 2, enter a number to choose your character: ");                                //Prompts for character selection
        System.out.println("1. Kirby");  
        System.out.println("2. Yoshi"); 
        System.out.println("3. Pikachu");     
        player2= in.nextInt();
        
        if(player2 == 1 && player1 != 1)                                                                         //If-else ladder for second player's input, makes it so only one player can be each character
        {
          playerK = new Kirby();
        }
        else if(player2 == 2 && player1 != 2)
            playerY= new Yoshi();
        else if(player2 == 3 && player1 != 3)
            playerP = new Pikachu();
        else
        {
            System.out.println("Player 2, please input a correct number or one not already chosen");
            player1 = in.nextInt();
        }
        
        
        
        if( playerK != null && playerY != null)                                                         //If statement for when Kirby and Yoshi are selected
        {
           while(playerK.getLives() != 0 && playerY.getLives() != 0)
           {
            System.out.println("Kirby, what do you want to do? (Please input number)");                //Continually prompts for Kirby player's attack
            System.out.println("1. Tilt Attack");
            System.out.println("2. Hammer");
            System.out.println("3. Stone");
            System.out.println("4. Final Cutter");
            input= in.nextInt();
            if(input == 1)                                                                     //If-else ladder to call methods for attacks based on number
                playerK.tiltAttack(playerY); 
            else if(input == 2)
                playerK.hammer(playerY);
            else if(input == 3)
                playerK.stone(playerY);
            else if(input == 4)
                playerK.finalCutter(playerY);
            else
            {
               System.out.println("Please enter a correct number");
               input= in.nextInt();
            }
            
            System.out.println("Yoshi is at " + playerY.getPercent() + "% !");               //Prints out Yoshi's stats after attack
            
            
            System.out.println("Yoshi, what do you want to do?");                            //Prompts for Yoshi player's attack
            System.out.println("1. Tilt Attack");
            System.out.println("2. Egg Roll");
            System.out.println("3. Egg Throw");
            System.out.println("4. Egg Bomb");
            input= in.nextInt();
            if(input == 1)                                                                  //If-else ladder to call methods for attacks
                playerY.tiltAttack(playerK); 
            else if(input == 2)
                playerY.eggRoll(playerK);
            else if(input == 3)
                playerY.eggThrow(playerK);
            else if(input == 4)
                playerY.eggBomb(playerK);
            else
            {
               System.out.println("Please enter a correct number");
               input= in.nextInt();
            }
            
            System.out.println("Kirby is at " + playerK.getPercent() + "% !");              //Prints out Kirby's stats after attack
           
            if (playerK.getPercent() >= maxPercent)                                        //If statement for when Kirby's percent reaches max
            {
             playerK.setPercent(0);                                                                                 //Resets percent 
             playerK.setLives((playerK.getLives())-1);                                                              //Subtracts a life 
             System.out.println("Kirby was knocked out and has " + playerK.getLives() + " lives left!");            //Prints out Kirby's lives left
            }
             else if (playerY.getPercent() >= maxPercent)                                       //If statement for when Yoshi's percent reaches max
             {
              playerY.setPercent(0);                                                                                  //Resets percent
              playerY.setLives((playerY.getLives())-1);                                                               //Subtracts a life each time 
              System.out.println("Yoshi was knocked out and has " + playerY.getLives() + " lives left!");             //Prints out lives left
             }
            
           }
   
           if(playerK.getLives() == 0)                                                                   //If-else ladder for checking who won and lost, based on who has 0 lives
            {
                System.out.println("Kirby has been defeated. Yoshi wins!");                             
            }
            else if(playerY.getLives() == 0)
            {
                System.out.println("Yoshi has been defeated. Kirby wins!");
            }
        }
        
        
        
        else if(  playerK != null && playerP != null)                                                   //If statement for when Kirby and pikachu are selected
        {
            while(playerK.getLives() != 0 && playerP.getLives() != 0)
          {
            System.out.println("Kirby, what do you want to do? (Please input number)");                //Continually prompts for Kirby player's attack
            System.out.println("1. Tilt Attack");
            System.out.println("2. Hammer");
            System.out.println("3. Stone");
            System.out.println("4. Final Cutter");
            input= in.nextInt();
            if(input == 1)                                                                     //If-else ladder to call methods for attacks based on number
                playerK.tiltAttack(playerP); 
            else if(input == 2)
                playerK.hammer(playerP);
            else if(input == 3)
                playerK.stone(playerP);
            else if(input == 4)
                playerK.finalCutter(playerP);
            else
            {
                System.out.println("Please enter correct number");
                input = in.nextInt();
            }
            
            System.out.println("Pikachu is at " + playerP.getPercent() + "% !");               //Prints out Pikachu's stats after attack
            
            
            System.out.println("Pikachu, what do you want to do?");                            //Prompts for Pikachu player's attack
            System.out.println("1. Tilt Attack");
            System.out.println("2. Thunder Jolt");
            System.out.println("3. Skull Bash");
            System.out.println("4. Call Thunder");
            input= in.nextInt();
            if(input == 1)                                                                  //If-else ladder to call methods for attacks
                playerP.tiltAttack(playerK); 
            else if(input == 2)
                playerP.thunderJolt(playerK);
            else if(input == 3)
                playerP.skullBash(playerK);
            else if(input == 4)
                playerP.thunder(playerK);
            else
            {
                System.out.println("Please enter correct number");
                input= in.nextInt();
            }
            
            System.out.println("Kirby is at " + playerK.getPercent() + "% !");              //Prints out Kirby's stats after attack
           
            if (playerK.getPercent() >= maxPercent)                                        //If statement for when Kirby's percent reaches max
            {
             playerK.setPercent(0);                                                                                 //Resets percent 
             playerK.setLives((playerK.getLives())-1);                                                              //Subtracts a life 
             System.out.println("Kirby was knocked out and has " + playerK.getLives() + " lives left!");            //Prints out Kirby's lives left
            }
             else if (playerP.getPercent() >= maxPercent)                                       //If statement for when Pikachu's percent reaches max
             {
              playerP.setPercent(0);                                                                                  //Resets percent
              playerP.setLives((playerP.getLives())-1);                                                               //Subtracts a life each time 
              System.out.println("Pikachu was knocked out and has " + playerP.getLives() + " lives left!");             //Prints out lives left
             }
            
          }
   
          if(playerK.getLives() == 0)                                                                   //If-else ladder for checking who won and lost, based on who has 0 lives
            {
                System.out.println("Kirby has been defeated. Pikachu wins!");                             
            }
            else if(playerP.getLives() == 0)
            {
                System.out.println("Pikachu has been defeated. Kirby wins!");
            }
        }
        
        
        else if( playerY != null && playerP != null)                                         //If statement for when Yoshi & Pikachu are selected
        {
            while(playerY.getLives() != 0 && playerP.getLives() != 0)
          {
            System.out.println("Yoshi, what do you want to do?");                            //Prompts for Yoshi player's attack
            System.out.println("1. Tilt Attack");
            System.out.println("2. Egg Roll");
            System.out.println("3. Egg Throw");
            System.out.println("4. Egg Bomb");
            input= in.nextInt();
            if(input == 1)                                                                  //If-else ladder to call methods for attacks
                playerY.tiltAttack(playerP); 
            else if(input == 2)
                playerY.eggRoll(playerP);
            else if(input == 3)
                playerY.eggThrow(playerP);
            else if(input == 4)
                playerY.eggBomb(playerP);
            else
            {
               System.out.println("Please enter a correct number");
               input= in.nextInt();
            }
            
            
            System.out.println("Pikachu is at " + playerP.getPercent() + "% !");               //Prints out Pikachu's stats after attack
            
            
            System.out.println("Pikachu, what do you want to do?");                            //Prompts for Pikachu player's attack
            System.out.println("1. Tilt Attack");
            System.out.println("2. Thunder Jolt");
            System.out.println("3. Skull Bash");
            System.out.println("4. Call Thunder");
            input= in.nextInt();
            if(input == 1)                                                                  //If-else ladder to call methods for attacks
                playerP.tiltAttack(playerY); 
            else if(input == 2)
                playerP.thunderJolt(playerY);
            else if(input == 3)
                playerP.skullBash(playerY);
            else if(input == 4)
                playerP.thunder(playerY);
            else
            {
                System.out.println("Please enter correct number");
                input= in.nextInt();
            }
            
            System.out.println("Yoshi is at " + playerY.getPercent() + "% !");              //Prints out Yoshi's stats after attack
           
            if (playerY.getPercent() >= maxPercent)                                        //If statement for when Yoshi's percent reaches max
            {
             playerY.setPercent(0);                                                                                 //Resets percent 
             playerY.setLives((playerY.getLives())-1);                                                              //Subtracts a life 
             System.out.println("Yoshi was knocked out and has " + playerY.getLives() + " lives left!");            //Prints out Yoshi's lives left
            }
             else if (playerP.getPercent() >= maxPercent)                                       //If statement for when Pikachu's percent reaches max
             {
              playerP.setPercent(0);                                                                                  //Resets percent
              playerP.setLives((playerP.getLives())-1);                                                               //Subtracts a life each time 
              System.out.println("Pikachu was knocked out and has " + playerP.getLives() + " lives left!");             //Prints out lives left
             }
            
          }
   
          if(playerY.getLives() == 0)                                                                   //If-else ladder for checking who won and lost, based on who has 0 lives
            {
                System.out.println("Yoshi has been defeated. Pikachu wins!");                             
            }
            else if(playerP.getLives() == 0)
            {
                System.out.println("Pikachu has been defeated. Yoshi wins!");
            }
        }
       
    }
}
package org.perscholas;
import java.util.Scanner;

public class PigDice {
   
    private static int rollDie(){
        return (int) (Math.random()*6) + 1;
    }
   
    public static void main(String[] args){
        int playerScore = 0, compScore = 0;
        int limit = 100;
        int playersum = 0;
        int diceface = rollDie();
        int playerDieFace = 0;
        int currentRound = 1;
        String choice ="", playerName= "";
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Let's play Pig Dice!");
        System.out.println("Please enter your name: ");
        playerName = scan.nextLine();
       
        //computer rolls
       while(true){
    	   	if ( (playerScore >= limit) || (compScore >= limit) )
    	   		break; 
    	   	
            System.out.println("Round "+currentRound+"\n");
            for(int num = 0; num < 3; num++){
                System.out.println("Computer rolls a die....");
                compScore += rollDie(); 
                }
            System.out.println("\nComputer's current score :"+compScore);
            //player rolls
            while(true){
                playersum = 0; //reset each turn 
                System.out.println("Roll a die?( y/ n)");
                System.out.println("Input \'s\' for current score");
                choice = scan.nextLine();
                if( choice.equals("y") )
                {
                    System.out.println(playerName+" rolls a die...");
                    playerDieFace = rollDie();
                    System.out.println(playerName+" has rolled a "+playerDieFace);
                   
                    if(playerDieFace > 1){
                        playersum += playerDieFace;
                    	playerScore += playersum;
                    	if(playerScore >= limit)
                    		break;
                    }
                    else if( playerDieFace == 1){
                    	System.out.println("no pts gained...");
                    	break;
                    }

                }
                    else if( choice.equals("n") )
                        break;
      
                    else if( choice.equalsIgnoreCase("s") )
                    	System.out.println(playerName+"'s current score is "+playerScore);
                    else //just loop again if user input is invalid 
                        continue;
                }
        currentRound++;
        }
        
        if(playerScore > compScore)
            System.out.println(playerName+" WINS!!!");
        else
            System.out.println(playerName+" loses, computer wins. Better luck next time");
    }
       
}
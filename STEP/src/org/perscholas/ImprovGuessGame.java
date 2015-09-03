package org.perscholas;
import java.util.Scanner; 

public class ImprovGuessGame {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int userGuess = 0;
		int winningGuess = (int) (Math.random() * 11); //random of guesses is 1 - 10
		
		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("You must guess what it is in three tries.");
		System.out.println("Enter a guess:"); 
	
		for(int num = 0; num < 3; num++)
		{
			userGuess = scan.nextInt();
			if( userGuess  == winningGuess  )
			{
				System.out.println("RIGHT!");
				System.out.println("You have won the game.");
				break; 
			}
			else
			{
				System.out.println("wrong");
				
			}
			
		}
		
		if( userGuess != winningGuess)
			System.out.println("You have lost the game.");
	}

}

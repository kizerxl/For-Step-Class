package org.perscholas;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
	
	public static void guess(){
		Scanner scan = new Scanner(System.in);
		int randomnum = (int)(Math.random() *10 + 1);
		int guess = 0, numOfguess = 0;
		try {
				while(numOfguess != 3){
					System.out.println("Enter a guess:"); 
					guess = scan.nextInt();
					if(guess != randomnum){
						hotOrCold(guess, randomnum);
						numOfguess++;
					}
					else
					{
						System.out.println("You have won the game!\n");
						break;
					}
				}
				
				if( guess != randomnum)
					System.out.println("\nThe correct number was "+randomnum+"\n You have lost the game.");
			}
		catch(InputMismatchException e){
			numOfguess++;	//count bad input towards guess
		}
		
	}
	
	public static void hotOrCold(int guess, int randomnum){
		int userguess = guess;
		int random = randomnum; 
		
		if(userguess >= random + 3)
			System.out.println("Cold");
		else if(userguess == random + 2)
	  		System.out.println("Warm");
		else 
	  		System.out.println("Hot");
	}
	
	public static void main(String[] args){
		System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");
		guess();	
	}

}

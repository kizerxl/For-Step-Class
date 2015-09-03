package org.perscholas;

import java.util.Scanner; 

public class Dollars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int cents, remainingCents, dollars; 
		final int dollarsInCents = 100; //100 cents to a dollars 
		System.out.println("Input the cents:"); 
		cents = scan.nextInt();
		dollars = cents / dollarsInCents; 
		remainingCents = cents % dollarsInCents; 
		System.out.println("This is : "+dollars+" and "+remainingCents+" cents.");
	
	}

}

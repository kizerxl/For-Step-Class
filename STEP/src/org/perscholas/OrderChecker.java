package org.perscholas;

import java.util.Scanner;
public class OrderChecker {

	public static void main(String[] args) {
		//price-points
		int bolt = 5, nut = 3, washer = 1; 
		int boltNum, nutNum, washerNum, total; 
		Scanner scan = new Scanner(System.in);
	
			System.out.println("Number of bolts: "); 
			boltNum = scan.nextInt(); 
			System.out.println("Number of nuts: "); 
			nutNum = scan.nextInt(); 
			System.out.println("Number of washers: "); 
			washerNum = scan.nextInt(); 
			
			if(nutNum < boltNum )
				System.out.println("\nCheck the order: too few nuts");
			if (washerNum < (2 * boltNum) )
				System.out.println("\nCheck the order: too few washers");
			if ( !(nutNum < boltNum) && !(washerNum < (2 * boltNum) ) ){
				System.out.println("Order is OK"); 
			}
			
			total = (boltNum * bolt) + (nutNum * nut) + (washerNum * washer);
			
			System.out.println("\nTotal cost: "+total); 

	}

}

package org.perscholas;
import java.util.Scanner;

public class DiscountPrices {
	public static void main(String[] args){
	 double purchaseAmt, discount = .10, limit = 10.00;  
	 double discountedPrice;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter amount of purchases:");
	 purchaseAmt = scan.nextDouble();
		System.out.println("Discounted Price: "+ ( (purchaseAmt > limit)? purchaseAmt - (purchaseAmt * discount):purchaseAmt ) );   
	
		 
	}
}

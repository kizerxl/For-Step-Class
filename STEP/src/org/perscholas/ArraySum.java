package org.perscholas;

import java.io.*;

public class ArraySum {

	public static void main(String[] args) throws IOException
	{
		int [][] data = { {3, 2 ,5 }, 
				{1, 4, 4, 8, 12}, 
				{9, 1, 0, 2}, 
				{0, 2, 6, 3, -1, -8} };
		
		//declare the sum
		int sum = 0; 
		
		for(int num = 0 ; num < data.length; num++){
			for(int num1 = 0; num1 < data[num].length; num1++){
				sum += data[num][num1];  
			}
			
		}
		
		System.out.println("The sum of the array is: "+sum);
	}

}

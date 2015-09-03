package org.perscholas;

public class Array {

	public static void main(String[] args) {
		int [] val = { 0, 1, 2, 3};
		int sum = 0; 
		int lastidx = val.length - 1;
		for(int num = 0; num <= lastidx ; num ++ ){
			sum += val[num]; 
		}
		System.out.println("Sum of all the numbers = "+ sum); 
	}

}

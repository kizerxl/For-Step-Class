package org.perscholas;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double area, radius; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the radius: ");
		radius = scan.nextDouble();
		area = Math.PI * Math.pow(radius, 2); 
		System.out.println("The area is: "+area);
		

	}

}

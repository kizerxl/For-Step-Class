package testpackage;
import java.util.Scanner; 

public class Conditional {

	public static void main(String[] args) {
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name:");
		name = scan.nextLine(); //newline character is consumed, please fix 
		
		if(name.equals("Felix") ) 
			System.out.println("I like that name ");

		else 
			System.out.println("Not a cool name...");

	}

}

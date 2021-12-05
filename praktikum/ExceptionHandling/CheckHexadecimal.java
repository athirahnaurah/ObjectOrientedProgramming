package praktikum.ExceptionHandling;

import java.util.Scanner;

public class CheckHexadecimal {
	
	public static void main(String[] args) {
		int value;
	    boolean stop = false;
		
	    do {
			Scanner input = new Scanner(System.in);
			System.out.print("Input Hexadecimal: ");
			String hex = input.next();
		    
		    try 
		    {
				value = Integer.parseInt(hex, 16);
				System.out.println(hex + " is hexadecimal!");
				System.out.println("Decimal Number: " + value);
				stop = true;
			} 
		    catch (NumberFormatException e) 
		    {
				System.out.println(hex + " is not hexadecimal, try again!");
			}
		} while(!stop);	
	}
}

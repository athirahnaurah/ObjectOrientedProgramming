package praktikum.ExceptionHandling;

import java.util.Scanner;

public class TextFieldInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
		try {
			System.out.print("Input integer: ");
			int integer = input.nextInt();
			System.out.println("Input valid!");
			input.close();
		} catch (Exception ex) {
			System.out.println("Input tidak valid!");
		}
	}
}

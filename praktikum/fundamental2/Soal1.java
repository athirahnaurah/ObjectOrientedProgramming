package praktikum.fundamental2;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberToken = 0;
		String s; 
		s = sc.nextLine();
		
		
		Scanner line = new Scanner(s);
		Scanner token = new Scanner(s);
		
		line.useDelimiter("[ ,!?._'@]");
		token.useDelimiter("[ ,!?._'@]");
		
		while(line.hasNext()) {
			line.next();
			numberToken++;
		}
		
		System.out.println(numberToken);
		
		while(token.hasNext()) {
			System.out.println(token.next());
		}

		sc.close();
		line.close();
		token.close();
	}

}

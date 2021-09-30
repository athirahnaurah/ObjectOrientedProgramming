package praktikum.fundamental2;

import java.util.Scanner;

public class Soal5 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String platNumber, mergePlat;
		long result;
		
		platNumber = sc.nextLine();
		sc.close();
		
		Scanner line = new Scanner(platNumber);
		line.useDelimiter(" ");
		
		
		mergePlat = line.next() + line.next() + line.next() + line.next();
		result = Long.parseLong(mergePlat) - 999999;
		
		if (result % 5 == 0) {
			System.out.println("Berhenti");
		}else {
			System.out.println("Jalan");
		}
		
		line.close();
	}
}


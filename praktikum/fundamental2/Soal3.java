package praktikum.fundamental2;

import java.util.Scanner;

public class Soal3 {
	public static void result(int A, int B, String operator) {
		if ( A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
			if ("+".equals(operator)) {
				System.out.println(A+B);
			}
				
			else if ("-".equals(operator)) {
				System.out.println(A-B);
			}
				
			else if("*".equals(operator)) {
				System.out.println(A*B);
			}
				
			else if ("/".equals(operator)) 
				{
				if ( A % B == 0) 
					System.out.println(A/B);
				else
					System.out.println("Tidak dapat melakukan pembagian");
				}
			else if("%".equals(operator)) {
				System.out.println(A%B);
			}
			else
				System.out.println("Bukan Operator");
				
			} else {
			System.out.println("Angka di luar batas");
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		String operator;
		String equation;
		
		equation = sc.nextLine();
		sc.close();
		
		Scanner line = new Scanner(equation);
		line.useDelimiter(" ");
		
		A = line.nextInt();
		operator = line.next();
		B = line.nextInt();
	
		line.close();
		
		result(A,B,operator);

	}
	
}



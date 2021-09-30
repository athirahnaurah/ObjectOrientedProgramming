package praktikum.fundamental2;

import java.math.*;
import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, sum, product;
		int limit1, limit2, sigvalue, sigvalue2;
		
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		
		//identify whether a BigInteger is positive or zero or negative
		sigvalue = a.signum();
		sigvalue2 = b.signum();
	
		//  convert the BigInteger to a String object and get the length of the String.
		limit1 = a.toString().length();
		limit2 = b.toString().length();
		
		if (limit1 <= 200 && limit2 <=200 && sigvalue != -1 && sigvalue2 != -1) {
			sum = a.add(b);
			product = a.multiply(b);
			
			System.out.println(sum);
			System.out.println(product);
		}
		
		sc.close();
	}

}

package com.fundamental;


public class Strings {
	public static void main(String[]args) {
		String A = "hello";
		String B = "java";
		int jumlah = A.length() + B.length();
		System.out.println(jumlah);
		if (A.compareTo(B)>0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		// capitalize first letter
		String kapitalA = A.substring(0,1).toUpperCase() + A.substring(1,5);
		String kapitalB = B.substring(0,1).toUpperCase() + B.substring(1,4);
		System.out.println(kapitalA+" "+kapitalB);
	}
	
}

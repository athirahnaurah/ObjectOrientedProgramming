package teori.exception;

import java.util.Scanner;

public class PenjumlahanInteger {
	 public static void main(String[] args) {
	  
	 Scanner input = new Scanner(System.in);
	 boolean stop = false;
	 
	  do{
	    try{
	    
	     System.out.print("Input integer ke-1: ");
	     int integer1 = input.nextInt();
	     System.out.print("Input integer ke-2: ");
	     int integer2 = input.nextInt();
	     stop = true;
	    
	     System.out.println("Nilai integer ke-1: " + integer1);
	     System.out.println("Nilai integer ke-2: " + integer2);
	     System.out.println("Hasil : " + integer1 + "+" + integer2 + "=" + (integer1 + integer2));
	     
	    }
	    
	    catch (Exception ex){
	     
	     System.out.println("Input yang dimasukkan bukan nilai integer! Masukkan kembali angka berupa integer!");
	     input.nextLine(); 
	    }
	    
	  }while(!stop); 
	  
	 } 
}
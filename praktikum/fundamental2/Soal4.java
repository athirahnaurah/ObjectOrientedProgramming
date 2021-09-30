package praktikum.fundamental2;

import java.util.Scanner;
public class Soal4 {
	public static void main(String[]args) {
		System.out.println("Gaji Agent");
		//membuat scanner
		Scanner keyboard = new Scanner(System.in);
		//input jumlah barang terjual
		System.out.print("Jumlah Penjualan :");
		int jmlJual = keyboard.nextInt();
		keyboard.close();
		
		double gaji = 500_000;
		int totalPenjualan = jmlJual * 50_000;
		double bonus = 0;
		double potongan = 0;
		
		//bonus dan potongan berdasarkan jumlah barang yang terjual
		if (jmlJual >= 40 && jmlJual <= 80) {
			bonus = 0.25 * totalPenjualan; 
		}else if(jmlJual > 80 ) {
			bonus = 0.35 * totalPenjualan;
		}else if(jmlJual < 15) {
			potongan = 0.15 * (50_000 * (15-jmlJual)); 
		}else {
			bonus = 0.1 * totalPenjualan;
		}
		
		if (jmlJual < 15) {
			gaji -= potongan;
		} else if ( jmlJual > 15) {
			gaji += bonus;
		}
		
		System.out.println("Gaji Akhir: " + gaji);
	}
	
}

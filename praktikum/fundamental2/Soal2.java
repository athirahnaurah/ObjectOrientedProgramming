package praktikum.fundamental2;


import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String[] s = new String[3];
		int[] n = new int[3];
		
        for(int i=0;i<3;i++){
            s[i] = keyboard.next();
            n[i]=keyboard.nextInt();
        }
        keyboard.close();
        System.out.println("================================");
        for(int i=0;i<3;i++) {
        	// kondisi if sesuai syarat pada spesifikasi program
        	if (n[i] >= 0 && n[i] <= 999 && s[i].length() <= 10) {
        		// %-15s --> is used for -15 spaces right side for string
        		// %03 --> used for 3 spaces left side for int with starting 0
        		// %n line break
            	System.out.printf("%-15s%03d%n",s[i],n[i]);
            }else {
            	System.out.println("tidak sesuai spesifikasi program");
            	break;
            }
        }
        System.out.println("================================");
        //https://gist.github.com/AlexanderChen0/318d4c074abd31bdc53c788ddfd4baa8


	}
}

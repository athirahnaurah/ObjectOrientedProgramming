package praktikum.fundamental;

//mengimpor scanner ke program
import java.util.Scanner;

/**
 *
 * @author User
 */
public class tipeData {
    public static void main(String[] args) {
        //membuat scanner
        Scanner keyboard = new Scanner(System.in);
        //mengambil data
        int T = keyboard.nextInt();
        
        for (int i=0; i<T; i++){
            try {
                long n = keyboard.nextLong();
            System.out.println(n+" can be fitted in:");
            if (n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE){System.out.println("* byte");}
            if (n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){System.out.println("* short");}
            if (n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){System.out.println("* int");}
            if (n>=Long.MIN_VALUE && n<=Long.MAX_VALUE){System.out.println("* long");}
            }
            catch (Exception e){
                System.out.println(keyboard.next()+"can’t be fitted anywhere");
            }
        }
        keyboard.close();
    }
}

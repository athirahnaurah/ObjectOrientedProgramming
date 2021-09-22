package teori.latihanjava1;

//mengimpor scanner ke program
import java.util.Scanner;

public class GradeSiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Nilai Tugas : ");
		byte nilaiTugas = keyboard.nextByte();
		System.out.print("Nilai UTS : ");
		byte nilaiUTS = keyboard.nextByte();
		System.out.print("Nilai UAS : ");
		byte nilaiUAS = keyboard.nextByte();
		double nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);
		System.out.println("Nilai Akhir: "+nilaiAkhir);
		
		if (nilaiAkhir > 85) {
			System.out.println("Grade : A");
		}else if (nilaiAkhir >= 75 && nilaiAkhir < 85) {
			System.out.println("Grade : B");
		}else if (nilaiAkhir >= 65 && nilaiAkhir < 75) {
			System.out.println("Grade : C");
		}else if (nilaiAkhir >= 49 && nilaiAkhir < 65 ) {
			System.out.println("Grade : D");
		}else if (nilaiAkhir < 50) {
			System.out.println("Grade : E");
		}
		keyboard.close();	
	}

}

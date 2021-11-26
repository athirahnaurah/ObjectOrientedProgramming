package praktikum.ExceptionHandling;

public class Array {

	public static void main(String[] args) {
		String[] mataKuliah = new String[3];
		try {
			mataKuliah[0] = "PBO";
			mataKuliah[1] = "Basis Data";
			mataKuliah[2] = "PRPL";
			
			System.out.println("Mata Kuliah: " + mataKuliah[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mata Kuliah Melebihi batas maksimal array!");
		}
	}
}

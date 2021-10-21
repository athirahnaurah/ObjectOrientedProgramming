package praktikum.classRelationship;

public class MainMahasiswa {

	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("Athirah Naurah Firdaus","201511004");
		MataKuliah mk = new MataKuliah("16TKO3014","Basis Data",4);
		MataKuliah mk2 = new MataKuliah("16KU23052","Pancasila",2);
		MataKuliah mk3 = new MataKuliah("16TKO3014","Aljabar Linear",2);
		
		mhs.tambahMatkul(mk);
		mhs.tambahMatkul(mk2);
		mhs.tambahMatkul(mk3);
		mhs.display();
	}

}

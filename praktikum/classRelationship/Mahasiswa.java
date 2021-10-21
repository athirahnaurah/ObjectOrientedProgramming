package praktikum.classRelationship;

public class Mahasiswa {
	private String nama;
	private String nim;
	MataKuliah matkul[];
	int i;
	
	public Mahasiswa(String nama, String nim) {
		this.nama = nama;
		this.nim = nim;
		i = 0;
		matkul = new MataKuliah[3];
	}
	
	public void tambahMatkul(MataKuliah MK) {
		matkul[i] = MK;
		i++;
	}
	
	public void display() {
		System.out.println("Nama: "+ nama + "\n" + "NIM: "+ nim);
		System.out.println("Daftar Mata Kuliah yang Diambil:");
		for (int j = 0; j <= 2; j++) {
			matkul[j].displayMatkul();
		}	
	}
	
//	public void createMatkul(String nama, String kode, int sks) {
//	MataKuliah mk = new MataKuliah(nama, kode, sks);
//	matkul[i] = mk;
//}
}

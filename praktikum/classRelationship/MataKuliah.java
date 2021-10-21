package praktikum.classRelationship;

public class MataKuliah {
	private String kodeMatkul;
	private String namaMatkul;
	private int jmlSKS;
	
	public MataKuliah(String kode, String nama, int sks) {
		this.kodeMatkul = kode;
		this.namaMatkul = nama;
		this.jmlSKS = sks;
	}
	
	public void displayMatkul() {
		System.out.println(this.kodeMatkul +" " + this.namaMatkul +" (" + this.jmlSKS + " sks)");
	}
}

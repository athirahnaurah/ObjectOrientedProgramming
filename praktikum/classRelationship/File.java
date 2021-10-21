package praktikum.classRelationship;

public class File {
	private String namaFile;
	private String jenis;
	
	public File (String nama, String jenis) {
		this.namaFile = nama;
		this.jenis = jenis;
	}
	
	public void displayFile() {
		System.out.println(namaFile + " - " + jenis);
	}
	
	
}

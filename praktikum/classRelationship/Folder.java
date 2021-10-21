package praktikum.classRelationship;

public class Folder {
	private String namaFolder;
	private File file[];
	private int i;
	
	public Folder(String nama) {
		namaFolder = nama;
		file = new File[3];
		i = 0;
	}
	
	public void createFile(String nama, String jenis) {
		File f = new File(nama, jenis);
		file[i] = f;
		i++;
	}
	
	public void displayFolder() {
		System.out.println("Folder " + namaFolder + " berisi file:");
		for (int j = 0; j <= 2; j++) {
			file[j].displayFile();
		}
	}
}

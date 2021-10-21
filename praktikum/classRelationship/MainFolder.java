package praktikum.classRelationship;

public class MainFolder {

	public static void main(String[] args) {
		Folder tugas = new Folder("Tugas Kuliah");
		
		tugas.createFile("PBO Praktikum 6", "ppt");
		tugas.createFile("Laporan Wawancara", "doc");
		tugas.createFile("Laporan PRPL", "pdf");
		
		tugas.displayFolder();
	}
}

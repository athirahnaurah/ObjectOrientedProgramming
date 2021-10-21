package praktikum.classRelationship;

public class Rumah {
	private String blokRumah;
	private int noRumah;
	
	public Rumah(String blok, int no) {
		blokRumah = blok;
		noRumah = no;
	}

	public String getBlokRumah() {
		return blokRumah;
	}

	public int getNoRumah() {
		return noRumah;
	}
}

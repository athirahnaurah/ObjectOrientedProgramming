package praktikum.classRelationship;

public class MainRumah {

	public static void main(String[] args) {
		Perumahan p = new Perumahan("Komplek Permata Cimahi ");
		Rumah r = new Rumah("D3",4);
		Rumah r2 = new Rumah("A1",7);
		Rumah r3 = new Rumah("G8",5);
		
		System.out.println(p.getPerumahan() + "terdiri dari rumah dengan :"); 
		System.out.println("blok " + r.getBlokRumah() + " No " + r.getNoRumah());
		System.out.println("blok " + r2.getBlokRumah() + " No " + r2.getNoRumah());
		System.out.println("blok " + r3.getBlokRumah() + " No " + r3.getNoRumah());
	}

}
